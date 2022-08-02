package Epam.by.task3.main;

import java.util.Scanner;

// Составить программу нахождения наименьшего из квадратов двух чисел а и b.

public class Task16{
    public static int chekInt(){                                        //метод проверки введенных данных
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите точки координат. \n x: ");
        int x = chekInt();
        System.out.print("y: ");
        int y = chekInt();
        if (x==0 & y==0) {
            System.out.println("В начале координат.");
        } else if(x ==0 & y!=0){
            System.out.println("На оси Y.");
        } else if(x!=0 & y==0){
            System.out.println("На оси X.");
        } else if(x>0 & y>0){
            System.out.println("В I четверти.");
        } else if(x<0 & y>0){
            System.out.println("В II четверти.");
        } else if(x<0 & y<0){
            System.out.println("В III четверти.");
        } else {
            System.out.println("В IV четверти.");
        }
    }
}