package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;
// Дана последовательность действительных чисел a a an , , , 1 2  . Указать те ее элементы, которые принадлежат отрезку [с, d].
public class Task15 {
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
        System.out.print("Введите значения отрезка \nс: ");
        double c = ch.chekDouble();
        System.out.print("d: ");
        double d = ch.chekDouble();
        System.out.println("Список чисел которые находятся на отрезке от "+c+" до "+d+":");
        for (Double i : massiv) {
            if (i>c && i<d) {
                System.out.printf("%.1f\n",i);
            }
        }
    }
}