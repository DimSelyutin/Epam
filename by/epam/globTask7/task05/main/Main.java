package by.epam.globTask7.task05.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Counter counter = new Counter();
        System.out.println("Enter number of start: ");
        counter.setNumberStart(sc.nextInt());
        System.out.println("Enter number of end: ");
        counter.setNumberEnd(sc.nextInt());
        
        counter.counter();
        counter.counterPrint();
        
    }
}
