package epam.by.task3.main;

import java.util.Scanner;


// Составить программу нахождения наименьшего из квадратов двух чисел а и b.

public class Task8{
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
    public static void main(String[] args){
            System.out.print("Введите число \n a: ");
            int a = chekInt();
            System.out.print("Введите число \n b: ");
            int b = chekInt();
            if (a<b) {
                System.out.println("Квадрат из числа "+a+" = "+a*a);
            } else {
                System.out.println("Квадрат из числа "+b+" = "+b*b);
            }
        }

    }
