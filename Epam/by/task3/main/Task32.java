package Epam.by.task3.main;
import java.util.Scanner;

// Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них
// положительной.
public class Task32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите три числа: \n a:");
        Task8 ch = new Task8();//проверка числа
        int a = ch.chekInt();
        System.out.print("b:");
        int b = ch.chekInt();
        System.out.print("c:");
        int c = ch.chekInt();
        if ((a+b)>0) {
            System.out.println("Сумма a и b положительна!");
        } else if((b+c)>0) {
            System.out.println("Сумма b и c положительна!");
        } else if((a+c)>0){
            System.out.println("Сумма a и c положительна!");
        } else {
            System.out.println("Сумма каких-то двух чисел отрицательна!");

        }
    }
}
