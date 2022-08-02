package epam.by.task4.main;

import java.util.Random;
import java.util.Scanner;
import epam.by.ChekInt;

public class Task2 {
    public static void main(String[] args){
        Random rand = new Random();
        ChekInt ch = new ChekInt();
        System.out.print("Введите размер массива: ");
        int x = ch.chekInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = rand.nextInt(100);
        }
        //массив создан
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                count++;
            }
        }

        int[] zeroPosition = new int[count];
        for (int i = 0, j =0; i < arr.length; i++) {
            if (arr[i]==0) {
                zeroPosition[j++]=i;
            }
        }
        for (int i : zeroPosition) {
            System.out.printf("[%d] ", i);
        }
    }
}
