package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        int a = ch.chekInt();
        ArrFill arf = new ArrFill();
        int[] massiv = arf.arrays(a);
        System.out.println("Массив значений создан.");
        int countPos = 0;
        int countNeg = 0;
        int countZer = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]>0) {
                countPos++;
            } else if (massiv[i]<0) {
                countNeg++;
            } else {
                countZer++;
            }
        }
        System.out.println("Кол-во положительных: "+countPos);
        System.out.println("Кол-во отрицательных: "+countNeg);
        System.out.println("Кол-во нулевых: "+countZer);

    }

}