package epam.by.task5.main;

import java.util.Random;
import java.util.Scanner;

// Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается
// как среднее арифметическое соседей соответствующего элемента исходной матрицы. Построить результат
// сглаживания заданной матрицы
public class Task534 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order value №1: ");
		    int x = sc.nextInt();
      
        System.out.print("Enter the order value №2 (№2>№1): ");
        int s = sc.nextInt();
		    int[][] arr = new int[x][s];
        

            //заполнение матрицы
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i<=j){
               arr[i][j] = 1;
                } else {
               arr[i][j] = 0;
                }
            }
        }
      
        //начальная матрица
        System.out.println("Finished matrix: ");
      
        for (int[] is : arr) {
            for (int j = 0; j < is.length; j++) {
                System.out.print("\t"+is[j]+"\t");
            }
            System.out.println();
        }

       
    }
}