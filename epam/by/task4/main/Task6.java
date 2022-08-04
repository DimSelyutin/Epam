package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        int a = ch.chekInt();
        
        ArrFill arf = new ArrFill();
        int[] massiv = arf.arrays(a);
        System.out.println("Массив значений создан.");
        
        int arrMax = massiv[0];
        int arrMin = massiv[0];
        
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]>arrMax) {
                arrMax = massiv[i];
            }
        }

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]<arrMin) {
                arrMin = massiv[i];
            }
        }

        for (int i : massiv) {
            System.out.println(i);
        }
        
        System.out.println("Ответ: "+ (arrMax - arrMin));
    }
}
