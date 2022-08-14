package epam.by.task5.main;

import java.util.Random;
import java.util.Scanner;
//24. Дан линейный массив n n x , x , , x , x 1 2  −1 . Получить действительную квадратную матрицу порядка n:
public class Task524 {
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
    }
}
