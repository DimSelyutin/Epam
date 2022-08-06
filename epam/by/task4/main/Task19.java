package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;
// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
// несколько, то определить наименьшее из них.
public class Task19 {
    public static void main(String[] args) {
        System.out.print("Enter number of valuses in array: ");
        ChekInt ch = new ChekInt();
        int a = ch.chekInt();

        // ArrFill arf = new ArrFill();
        // int[] massiv = arf.arrays(a);


        int[] massiv = new int[a];
        for (int i = 0; i < massiv.length; i++) {
                massiv[i] = ch.chekInt();
        }


        System.out.println("Array is created.");
        for (int i : massiv) {
            System.out.println(i);
        }

        int count = 0;          //счетчик наиболее часто встречающегося значения
        int countBigest = 0;    //счетчик перебора count
        int num = 99;            //значение
        int numberLit = 0;      

        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                if (massiv[i] == massiv[j]) {
                    count++;
                }
            }
            if (count==countBigest) {
                if (massiv[i]<num) {
                    num = massiv[i];
                }
            }
            if (count>countBigest) {
                countBigest=count;
                if (massiv[i]<num) {
                    numberLit = massiv[i];
                }
            }
         
            count=0;
        }
        System.out.println("Наименьшее из встречающихся чисел: "+numberLit);
    }
}