package epam.by.task5.main;

import java.util.Random;
import java.util.Scanner;

public class Task530 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] arr= new int[10][20];


        //заполнение матрицы от 1 до 15
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(1,15);
            }
        }
        
        System.out.println("Введите любой символ для создания матриицы...");
        sc.next();

        String countStr = "";
        int count =0;
        System.out.println("Готовая матрица: ");


        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[i].length;j++) {
                System.out.print("\t"+arr[i][j]);
                if (arr[i][j]==5) {
                    count++;
                }
            }
          
            if (count>=3) {
                countStr += i+" ";
            }
          
            count=0;
            System.out.println();
        }

        System.out.println("Номера строк в которых 5 встречается больше 3-x раз: \n" + countStr);

    }
}
