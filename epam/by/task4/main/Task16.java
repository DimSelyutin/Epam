package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;
// Дана последовательность действительных чисел a a an , , , 1 2  . Указать те ее элементы, которые принадлежат отрезку [с, d].
public class Task16 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        int a = ch.chekInt();
        ArrFill arf = new ArrFill();
        Double[] massiv = arf.arraysDuoble(a);
        System.out.println("Массив значений создан.");
        for (Double i : massiv) {
            System.out.printf("%.1f \n",i);
        }
    }
}