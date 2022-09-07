package by.epam.globTask5.main;
//22. сформировать квадратную матрицу
import java.util.Scanner;


public class Task522 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number if array: ");
		
		
		int x = sc.nextInt();
		int[][] arr = new int[x][x];
		
		
	    for(int i=0;i<arr.length;i++){
	         for(int j=arr.length-1-i, l=arr.length;j>=0;j--, l--){
	             
	             arr[i][j]=l;
	             
	         }
	         
	    }
	    
	    
	    for(int i=0;i<arr.length;i++){
	         for(int j=0;j<arr[i].length;j++){
	             
	             System.out.print("\t"+arr[i][j]);
	         }
	         
	         System.out.println("\n");
	         
	    }
	    
	    
		
	}
}

