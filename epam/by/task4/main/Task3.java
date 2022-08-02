package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        int a = ch.chekInt();
        ArrFill arf = new ArrFill();
        int[] massiv = arf.arrays(a);
        System.out.println("Массив значений создан.");
        for (int i : massiv) {
            if (i>0) {
                System.out.println("Положительное встречается раньше!");
                break;
            } else {
                System.out.println("Отрицательное встречается раньше!");
                break;
            }
        }
    }
}
