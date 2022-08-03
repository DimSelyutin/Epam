package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;
// Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в
// промежутке от L до N.
public class Task13 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        int a = ch.chekInt();
        ArrFill arf = new ArrFill();
        int[] massiv = arf.arrSubseq(a);
        System.out.println("Массив значений создан.");
        for (int i : massiv) {
            System.out.println(i);
        }
        System.out.print("Введите чилсо кратное которому будут выведены елементы: \nМ: ");
        int m = ch.chekInt();
        System.out.print("Между какими числами должны быть элементы? \nL: ");
        int l = ch.chekInt();
        System.out.print("N: ");
        int n = ch.chekInt();

        for (int i : massiv) {
            if (i%m==0 && i>l && i<n) {
                System.out.println(i);
            }
        }
    }
}