package by.epam.globTask5.main;

import java.util.Random;
import java.util.Scanner;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Task532 {
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
                arr[i][j]=rand.nextInt(100);
            }
        }
      
        //начальная матрица
        System.out.println("Matrix created: ");
        for (int[] is : arr) {
            for (int j = 0; j < is.length; j++) {
                System.out.print("\t"+is[j]+"\t");
            }
            System.out.println();
        }

        //Сортировка
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int j2 = 0; j2 < arr[i].length; j2++) {
                    if(arr[i][j2]>arr[i][j]){
                        count = arr[i][j2];
                        arr[i][j2] = arr[i][j];
                        arr[i][j]=count;
                     }
                }
                
            }
        }
      
        ///конечная матрица
        System.out.println("Finished matrix: ");
        for (int[] is : arr) {
            for (int j = 0; j < is.length; j++) {
                System.out.print("\t"+is[j]+"\t");
            }
            System.out.println();
        }
       
    }
}
