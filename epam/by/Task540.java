		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number if array: ");
		int x = sc.nextInt();
		int[][] arr = new int[x][x];
	int count=0;
	for(int i=0,j=arr.length/2;count!=x*x;i--,j++){
		    count++;
		    
		      if(i==-1){
		         i=arr.length-1;
		     } else if(j==arr.length){
		         j=0;
		     }
		     
		     if(arr[i][j]!=0){
		         i+=2;
		         j-=1;
		     } 
		     
		    if(j>=arr.length){
		        j=-1;
		   }else if(i<0){
		        i=arr.length;
		    }
		    if(!(i==0 && j==arr.length-1)){
		         
		         System.out.println(i+" "+j);
		         arr[i][j]=count;
		    } else {
		       System.out.println(i+" "+j);
		         arr[i][j]=count;    
		         i=2;
		         j=arr.length-2;
		    }
	
		    if(count==x*x){
		        count=x*x;
		    }
		}
		
		
		
		
		
		
		for(int i = 0; i<arr.length;i++){
		    for(int j =0;j<arr.length;j++){
		        System.out.print("\t"+arr[i][j]);
		    }
		    System.out.println("\n");
		}
	}
}
