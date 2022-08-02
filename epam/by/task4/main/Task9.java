package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;

public class Task9 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();                     
        int a = ch.chekInt();                   //проверка значения
        ArrFill arf = new ArrFill();
        Double[] massiv = arf.arraysDuoble(a);           //создание массива
        System.out.println("Массив значений создан.");
        System.out.println("Первоначальный массив:");
        for (Double i : massiv) {
            System.out.printf("%.1f \n",i);
        }

        int indexMax = 0;
        int indexMin = 0;
        double countMax = massiv[0];
        double countMin = massiv[0];
        double count = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]>countMax) {
                countMax = massiv[i];
                indexMax=i;                     //индекс наибольшего значения
            } else if(massiv[i]<countMin){
                countMin = massiv[i];
                indexMin = i;                   //индекс наименьшего значения
            }
        }

        count = massiv[indexMax];
        massiv[indexMax] = massiv[indexMin];
        massiv[indexMin] = count;
        System.out.println("Конечный массив:");

        for (double i : massiv) {
            System.out.printf("%.1f \n",i);
        }

    }
}