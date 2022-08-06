package epam.by.task3.main;

import java.util.Scanner;
// Вычислить значения функции на отрезке [а,b] c шагом h:
public class Task82 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длинну отрезка: \n Точка a: ");
        Double a,b,h,x;
        a = sc.nextDouble();
        System.out.print("Точка b: ");
        b = sc.nextDouble();
        System.out.print("Введите длинну шага: ");
        h = sc.nextDouble();
        System.out.print("Введите x: ");
        x = sc.nextDouble();
        double y;
        for (double i = a; i <= b; i+=h) {
            if (x==15) {
                y = (x+i)*2;
                System.out.println(y);
            } else {
                y=(x-i)+6;
                System.out.println(y);
            }
        }
    }
}
