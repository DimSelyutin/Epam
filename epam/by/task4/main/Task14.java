package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;
// Дан одномерный массив A[N]. Найти:
// max(четных) + min(нечетных) a2 a4  a2k + a1 a3  a2k+1
public class Task14 {
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
        
        System.out.println("Сумма максимального из четных и минимального из нечетных равна: ");
        int count = massiv[0];
        int count2 = massiv[0];
        
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]%2==0) {
                if (massiv[i]>count) {
                    count = massiv[i];
                }
                
            } else if(massiv[i]%2!=0){
                if(massiv[i]<count2){
                    count2 = massiv[i];
                    System.out.println(massiv[i]);
                }

            }
        }
        
        System.out.print(count+"+"+count2+" = "+(count+count2));
    }
}
