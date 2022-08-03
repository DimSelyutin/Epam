package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;

public class Task12 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        int a = ch.chekInt();
        ArrFill arf = new ArrFill();
        int[] massiv = arf.arrSubseq(a);
        System.out.println("Массив значений создан.");
        
        for (int i : massiv) {
            System.out.println(i);
        }
        System.out.println("Конечный массив: ");
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]==2 || massiv[i]==3) {
                System.out.println(massiv[i]);
            } else if (massiv[i] <=1 || massiv[i]%2==0 || massiv[i]%3==0){
                continue;
            } 
            for (int j = 5; j*j <= massiv[i]; j+=6) {
                if(massiv[i]%j==0 || massiv[i]%(j+2)==0){
                    continue;
                }
                System.out.println(massiv[i]);
            }
            if(massiv[i]<25){
            System.out.println(massiv[i]);
            }
        }
        

    }
}