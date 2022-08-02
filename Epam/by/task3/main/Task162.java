package Epam.by.task3.main;
import java.util.Scanner;
// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
public class Task162 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double x;
        double count = 1;

        System.out.print("Введите число: ");
        x = sc.nextInt();
        for (double i = 1; i <= x; i++) {
            count*=(i*(i+1))/2;
            System.out.println(count);
        }
        System.out.println("Ответ: "+count);
        }
}
