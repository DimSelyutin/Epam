package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;

public class Task11 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        
        int a = ch.chekInt();
        ArrFill arf = new ArrFill();
        int[] massiv = arf.arrays(a);
        System.out.println("Массив значений создан.");
        
        System.out.println("Первоначальный массив:");
        
        for (int i : massiv) {
            System.out.println(i);
        }
        
        int m;
        
        do {
            System.out.print("Введите на какое число будем делаить: ");
            m = ch.chekInt();
        } while (m<=0);
        
        int l;
        
        do {
            System.out.print("Укажите какой остаток хотите получить: ");
            l = ch.chekInt();
            
        } while (l>m || l<0);
        
        int count=0;
        
        for (int i : massiv) {
            if (i%m==l) {
                System.out.println(i);
                count++;
            }
        }
        
        if (count==0) {
            System.out.println("Ни одно значение не делится на "+m+" с остатком "+l+".");
        }
    }
}
