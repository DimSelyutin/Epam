package epam.by.task4.main;

import java.util.Random;

import epam.by.ChekInt;

public class Task18copy {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.print("Выберите две значение вставленых 2-х кубиков: \nПервый кубик: ");
        
        ChekInt ch = new ChekInt();
        int first;
            do {
                first = ch.chekInt();
            } while (first>6 || first<0);
        System.out.print("Второй кубик:");
        int second;
            do {
                second = ch.chekInt();
            } while (second>6 || second<0);
////////////////////////Запись имеющихся значений.
            int[] massiv =new int[10];

            int a = rand.nextInt(0,9);
            int b;
            do {
                b = rand.nextInt(0,9);
            } while (a==b);
            massiv[a]=first;
            massiv[b]=second;

            int[] cop = new int[10];
            for (int i = 0; i < cop.length; i++) {
                cop[i]=massiv[i];
            }
////////////////////////Подбор неизвестных значений.
            for (int i = 0; i < cop.length; i++) {
                if (cop[i]!=0) {
                    if (i<=8) {
                        cop[i+1]= 10-cop[i];
                    } else {
                        cop[i-1]= 10-cop[i];

                    }
                }
            }
        
        
        System.out.println("Правильные значения: ");
        for (int i : cop) {
            System.out.println(i);
        }
    }
}
