package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;

public class Task10 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        int a = ch.chekInt();
        ArrFill arf = new ArrFill();
        int[] massiv = arf.arrays(a);
        System.out.println("Массив значений создан.");
        System.out.print("Введите число больше которого вывести значения: \ni: ");
        int num = ch.chekInt();
        for (int i : massiv) {
            if (i>num) {
                System.out.println(i);
            }
        }
    }
}