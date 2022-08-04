package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;


public class Task1{
    public static void main(String[]args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        
        int a = ch.chekInt();
        ArrFill arf = new ArrFill();
        
        int[] massiv = arf.arrays(a);
        
        System.out.print("Массив значений создан.\nВыберите кратные какому числу вывести значения: ");
        int b = ch.chekInt();
        
        for (int i = 0; i < massiv.length; i++) {
            if(massiv[i]%b==0 && massiv[i]!=0){
                System.out.println(massiv[i]);
            }
        }
        
    }
}
