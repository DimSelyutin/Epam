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
        for (Double double1 : massiv) {
            System.out.printf("%.1f | ",double1);
        }
        
        for (int j = 0; j < massiv.length; j++) {
            if (massiv[j]>massiv[++j]) {
                System.out.println("Массив является не возрастающим!");
                break;
            } else {
                System.out.println("Массив является возрастающим!");
            }
        }
    }
}
