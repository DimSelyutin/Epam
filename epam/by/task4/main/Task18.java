package epam.by.task4.main;

import java.util.Random;

import epam.by.ChekInt;

public class Task18 {
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
        boolean bool = true;
        do {
            for (int i = 0; i < massiv.length; i++) {
                if(cop[i]==0){
                    cop[i]= rand.nextInt(1,6);
                }
            }//заполнение значениями
            System.out.println("Промежуточный массив: ");
            for (int i : cop) {
                System.out.println(i);
            }
            for (int i = 0,j=1,l=2; i < cop.length; i++,j++,l++) {
                if (l==7) {
                    i=cop.length;
                }else if(cop[i]+cop[j]+cop[l]==10) {
                    bool = false;
                } 
            }//сравнение значений
        } while (bool);
        System.out.println("Правильные значения: ");
        for (int i : cop) {
            System.out.println(i);
        }
    }
}
