package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        int a = ch.chekInt();
        ArrFill arf = new ArrFill();
        int[] massiv = arf.arrays(a);
        System.out.println("Массив значений создан.");
        int count =0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]%2==0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Четных значений не обнаружено!");
        } else {
            int[] arrPos = new int[count];
            for (int i = 0, j = 0; i < massiv.length; i++) {
                if (massiv[i]%2==0) {
                    arrPos[j]=massiv[i];
                    j++;
                }
            }
            for (int i : arrPos) {
                System.out.print(i+" | ");
            }
        }
    }
}
