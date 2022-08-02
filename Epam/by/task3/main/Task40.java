package Epam.by.task3.main;

import java.util.Scanner;

// Вычислить значение функции: F(x)= (-x^3+9),-(3/(x+1)). Если x<= 13 и x>13.
public class Task40 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x;
        double fx;
        System.out.println("Введите значение х: ");
        x = sc.nextInt();
        if (x<=13) {
            fx = -(Math.pow(x, 3)+9);
            System.out.println(fx);
        } else {
            fx = -(3/(x+1));
            System.out.println(fx);
        }
    }
}
