package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        int a = ch.chekInt();
        ArrFill arf = new ArrFill();
        Double[] massiv = arf.arraysDuoble(a);
        System.out.println("Массив значений создан.");
        int i=0;
        do {
            i++;
            if (massiv[i--]>massiv[i]) {
                System.out.println("Массив является не возрастающим.");
            }
        } while (massiv[i]<massiv[i++]);
        // for (int i = 0; i < massiv.length; i++) {
        //     if (massiv[i++]<massiv[i] ) {
        //         System.out.println("Массив является не возрастающим!");
        //     } else {

        //     }
        // }
    }
}
