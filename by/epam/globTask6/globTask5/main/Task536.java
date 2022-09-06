package by.epam.globTask6.globTask5.main;

import java.util.Random;
import java.util.Scanner;

// Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается
// как среднее арифметическое соседей соответствующего элемента исходной матрицы. Построить результат
// сглаживания заданной матрицы
public class Task536 {
    public static void main(String[] args) {
        System.out.print("Enter the order value №1: ");
        Random rand = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int[][] arr = new int[x][x];           

                //заполнение матрицы
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = rand.nextInt(-50,100);
                }
            }


            //начальная матрица
            System.out.println("Изначальная матрица: ");
            for (int[] is : arr) {
                for (int j = 0; j < is.length; j++) {
                    System.out.print("\t"+is[j]+"\t");
                }
                System.out.println();
            }

            //сглаживание
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (j==0 && i!=0) {
                        arr[i][j] = (arr[i-1][arr.length-1] + arr[i][j+1])/2;
                    }else if(j==arr.length-1 && i==arr.length-1){
                        arr[i][j] = (arr[i][j-1] + arr[i][j])/2;
                    }else if (i==0 && j==0){
                        arr[i][j] =(arr[i][j] + arr[i][j+1])/2;
                    } else if(j<arr.length-1){
                        arr[i][j] =(arr[i][j-1] + arr[i][j+1])/2;

                    }
                }
            }

            System.out.println("Сглаженная матрица: ");

            for (int[] is : arr) {
                for (int j = 0; j < is.length; j++) {
                    System.out.print("\t"+is[j]+"\t");
                }
                System.out.println();
            }
            
        }
    }
}
