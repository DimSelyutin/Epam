package epam.by.task4.main;

import epam.by.ArrFill;
import epam.by.ChekInt;
// Даны действительные числаa a an, , , 1 2 . Найти max( , , , ) a1 + a2n a2 + a2n−1  an + an+1
public class Task16 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во значений в массиве: ");
        ChekInt ch = new ChekInt();
        
        int a = ch.chekInt();
        ArrFill arf = new ArrFill();
        
        Double[] massiv = arf.arraysDuoble(a);
        
        System.out.println("Массив значений создан.");
        
        for (Double i : massiv) {
            System.out.printf("%.1f \n",i);
        }
        System.out.println("Массив после преобразований: ");
        double[] count = new double[massiv.length/2];
        for (int i = 0, j=massiv.length-1; i < massiv.length/2; i++) {
                count[i]=massiv[i]+massiv[j];
                j--;
        }
        for (double d : count) {
            System.out.printf("%.1f\n",d);
        }
        
        Double maxCount = count[0];
        
        
        for (int i = 0; i < count.length; i++) {
            if (count[i]>maxCount) {
                maxCount=count[i];
            }
        }
        
        System.out.printf("Максимальное значение: %.1f",maxCount);
    }
}
