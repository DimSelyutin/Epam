package by.epam.globTask6.globTask5.main;

import java.util.Random;
import java.util.Scanner;

// 28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
// содержит максимальную сумму.

public class Task528 {
    public static void main(String[] args) {
        System.out.print("Enter the order value №1: ");
      
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
      
		    int x = sc.nextInt();
		    int[][] arr = new int[x][x];
        

            //заполнение матрицы
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(1,100);
            }
        }

        //начальная матрица
        System.out.println("Beginer matrix: ");
      
        for (int[] is : arr) {
            for (int j = 0; j < is.length; j++) {
                System.out.print("\t"+is[j]+"\t");
            }
            System.out.println();
        }
      
        int count = 0;
        int primeCount =0;
        String colum = "";
      
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                count += arr[j][i];
            }
            if (count>primeCount) {
                primeCount=count;
                colum = ""+(i+1);
            }
            count=0;
        }
      
        System.out.println("The largest amount contains colum №"+colum +" Сумма: "+primeCount);


    }
}
