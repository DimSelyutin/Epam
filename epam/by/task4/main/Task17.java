package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;
// Дана последовательность целых чиселa a an, , ,1 2 . Образовать новую последовательность, выбросив из исходной
// те члены, которые равны min( , , , ) a1 a2  an
public class Task17 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        int a = ch.chekInt();
        
        ArrFill arf = new ArrFill();
        int[] massiv = arf.arrays(a);
        
        System.out.println("Массив значений создан.");
        for (int i : massiv) {
            System.out.println(i);
        }
        
        int count=massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]<count) {
                count=massiv[i];
            }
        }

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]==count) {
                for (int j = i+1; j < massiv.length; j++) {
                    massiv[j-1]=massiv[j];
                }
                massiv[massiv.length-1]=0;
            }
            
        }

        System.out.println("Новый массив: ");
        for (int i : massiv) {
            System.out.println(i);
        }
    }
}
