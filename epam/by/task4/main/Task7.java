package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;

public class Task7 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        int a = ch.chekInt();
        
        ArrFill arf = new ArrFill();
        int[] massiv = arf.arrays(a);
        System.out.println("Массив значений создан.");
        
        System.out.print("Введите ваше значение: ");
        int number = ch.chekInt();
        
        int count = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]>number) {
                massiv[i]=number;
                count++;
            }
        }
        
        for (int i : massiv) {
            System.out.println(i);
        }
        
        System.out.println("Кол-во замен: "+count);
    }
}
