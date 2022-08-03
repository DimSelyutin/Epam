package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;
// Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
// (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
public class Task20 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        int a = ch.chekInt();
        ArrFill arf = new ArrFill();
        int[] massiv = arf.arrays(a);
        System.out.println("Массив значений создан.");
        for (int i : massiv) {
            System.out.print(i+" | ");
        }
        for (int i = 0; i < massiv.length; i++) {
            if (i%2!=0) {
                massiv[i]=0;
            }
        }
        System.out.println("\nИзмененный массив: ");
        for (int i : massiv) {
            System.out.print(i+" | ");
        }
        System.out.println("\nСдвиг значенией:");
        int count = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]==0) {
                for (int j = i+1; j < massiv.length; j++) {
                    massiv[j-1] = massiv[j];
                }
                massiv[massiv.length-1] = 0;
            }

        }
        for (int i : massiv) {
            System.out.print(i+" | ");
        }
    }
}
