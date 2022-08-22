package epam.by.task5.main;


import java.util.Scanner;
//22. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task522 {
    public static void main(String[] args) {
        System.out.print("Enter the order value: ");
      
        Scanner sc = new Scanner(System.in);
      
		int x = sc.nextInt();
		int[][] arr = new int[x][x];
        

        //заполнение матрицы
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >= 0; j--) {
                if (i==0 || j==1) {
                    arr[i][j] = x;
                }

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
