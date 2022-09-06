package by.epam.globTask6.globTask5.main;

import java.util.Scanner;
//40 Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ...,2n
// так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
// Построить такой квадрат.
public class Task540 {
	
    
    public static void main(String[] args) {
        System.out.print("Enter the order value: ");
        try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int[][] arr = new int[x][x];
			if (x%2!=0) {
				// //Цикл для нечетного порядка
				int countOdd=0;											//счетчик значений для заполнения масива
				for(int i=0,j=arr.length/2;countOdd!=x*x;i--,j++){				

					countOdd++;										//счетчик = 1

					if(i==-1){										//если итерация вышла за пределы массива верни ее в пределы массива
						i=arr.length-1;
					} else if(j==arr.length){
						j=0;
					}
					 
					if(arr[i][j]!=0){									//если ячейка занята перейди на строку ниже
						i+=2;
						j-=1;
					} 
					 
					if(j>=arr.length){									//если итерация вышла за пределы массива верни ее в пределы массива
						j=-1;
					}else if(i<0){
						i=arr.length;
					}

					if(!(i==0 && j==arr.length-1)){								//если итерация не в правом верхнем углу 
						arr[i][j]=countOdd;
					} else {										//если итерация в правом верхнем углу 
						arr[i][j]=countOdd;    
						i=2;
						j=arr.length-2;
					}
			
					if(countOdd==x*x){
						countOdd=x*x;
					}
				}
				
			} else if(x%2==0  && x%4!=0){
				System.out.println("Метод построения неизвестен :(");

				
			} else {
				//цикл для четного опрядка
				int count=1;
				for (int i = 0,t=1,p=2; i < arr.length; i++,t--,p--) {						//t и p - счетчики горизонтали
					for (int j = 0,l=0,k=4; j < arr.length; j++,l--,k--) {					//l и k - счетчики вертикали
						if (t==0) {																			//построение горизонтальных значений
							arr[i][j]=count;			
						}else if (p==0) {
							arr[i][j]=count;
						}

						if (l==0) {																			//построение вертикальных значений
							arr[i][j]=count;
							if ((t==0 && l==0) || (t==0 && k==0) || (p==0 && l==0) || (p==0 && k==0)) {		//если счетчики встречаются в этих точках, приравнять к 0
								arr[i][j]=0;
							}
							l=3;			
						}else if (k==0) {																	//построение вертикальных значений
							arr[i][j]=count;
							if ((t==0 && l==0) || (t==0 && k==0) || (p==0 && l==0) || (p==0 && k==0)) {		//если счетчики встречаются в этих точках, приравнять к 0
								arr[i][j]=0;
							}
							l+=1;
							k=4;
						}
						
						count++;
					}
					if (t==0) {			//построение горизонтальных значений
						t=3;			
					}else if (p==0) {
						t+=1;
						p=4;
					}
				}
			}	


			int count2 = 1;									//заполнение недостающих значений и получение магического квадрата
			for (int j = arr.length-1; j >=0; j--) {
					for (int l = arr.length-1; l >= 0; l--) {
						if (arr[j][l]==0) {
							arr[j][l]=count2;
						}
						count2++;
						
					}
				}

			//----------Вывод массива----------------
			for(int i = 0; i<arr.length;i++){
			    for(int j =0;j<arr.length;j++){
			        System.out.print("\t"+arr[i][j]);
			    }
			    System.out.println("\n");
			}
		}
	}
}
