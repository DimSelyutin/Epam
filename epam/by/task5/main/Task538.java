package epam.by.task5.main;

import java.util.Random;
import java.util.Scanner;

//Найдите сумму двух матриц
public class Task538 {
    public static void main(String[] args) {
        System.out.print("Enter the order value №1: ");
	    
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	    
	int[][] arr = new int[x][x];
	int[][] arr2 = new int[x][x];
	    
        int count1= 0;
        int count2 = 0;

            //заполнение матриц
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(-100,100);
            }
        }
	    
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = rand.nextInt(100);
            }
        }

	    
        //вывод матриц
        for (int[] is : arr) {
            for (int j = 0; j < is.length; j++) {
                System.out.print("\t"+is[j]+"\t");
            }
            System.out.println();
        }
	    
	    
        //подсчет суммы матриц
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count1 += arr[i][j];
            }
        }

	    
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                count2 += arr2[i][j];
            }
        }
        
	    
        System.out.println("Матрица №1 = "+ count1);
        System.out.println("Матрица №2 = "+ count2);
        System.out.println("Сумма матриц = "+ (count2+count1));

    }
}
