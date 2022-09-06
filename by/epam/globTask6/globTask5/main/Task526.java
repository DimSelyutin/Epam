package by.epam.globTask6.globTask5.main;

import java.util.Random;
import java.util.Scanner;

// С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:
// а) вычислить сумму отрицательных элементов в каждой строке;
// б) определить максимальный элемент в каждой строке;
// в) переставить местами максимальный и минимальный элементы матрицы.

public class Task526 {

    /**
     * @return Scanner is resource
     *
     */
    public static int chekInt(){
          Scanner sc = new Scanner(System.in);
          int x = 0;
          
          if (!sc.hasNextInt()) {
              System.out.println("Видимо вы вводите не число :(");

          } else {
              x = sc.nextInt();
          }
          return x;
    }
  
  
    public static void main(String[] args) {
        System.out.print("Enter the order value №1 of matrix: ");
        Random rand = new Random();

		int x = chekInt();
        System.out.print("Enter the order value №2: "+x+"x..");

        int s = chekInt();
		    int[][] arr = new int[x][s];
        System.out.println("Size of matrix: "+x+"x"+s+"\n Enter a value: ");

            //заполнение матрицы
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = chekInt();
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

        int countAdverse = 0;                         //Вычисление суммы отрицательных значений
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]<0) {
                    countAdverse += arr[i][j];
                }
            }
        }

        int countMax = arr[0][0];
        int[][] lineMax = new int[x][x];                         //Вычисление max значений
        for (int i = 0,l=0; i < arr.length; i++,l=0) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]>countMax) {
                    countMax = arr[i][j];
                }

            }
            lineMax[i][l] = i;
            lineMax[i][l+1] = countMax;
            countMax=0;
        }

        int countMin = arr[0][0];
        int _countMax = 0;
        int minId=0, _minId= 0;  
        int maxId=0, _maxId= 0;              //id минимальных и макс значений
                    
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {

                if (arr[i][j]<countMin) {
                  
                    countMin=arr[i][j];
                    minId = i;
                    _minId = j;
                  
                }else if(arr[i][j]>_countMax){
                  
                    _countMax = arr[i][j];
                    maxId = i;
                    _maxId= j;
                  
                }

            }
        }

        
        //замена макс и мин значений
        arr[minId][_minId] = _countMax;
        arr[maxId][_maxId] = countMin;


        System.out.println("Sum of adverse value: " + countAdverse);
        System.out.println();


        System.out.println("The maximum value in every line: ");
        for (int i = 0; i < lineMax.length; i++) {
          
                System.out.println("Line №"+(lineMax[i][0]+1)+": "+lineMax[i][1]);
          
        }


        System.out.println();
        System.out.println("Array after replacement max on min value: ");
        for (int[] is : arr) {
          
            for (int is2 :is) {
                System.out.print(is2+"\t");
            }
            System.out.println();
          
        }

    }
}
