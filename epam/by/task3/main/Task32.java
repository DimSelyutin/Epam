package epam.by.task3.main;

// Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них
// положительной.
public class Task32 {
    public static void main(String[] args){
        System.out.print("Введите три числа: \n a:");
        Task8 ch = new Task8();//проверка числа

        int a = Task8.chekInt();
        System.out.print("b:");
        int b = Task8.chekInt();

        System.out.print("c:");
        int c = Task8.chekInt();
        
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
