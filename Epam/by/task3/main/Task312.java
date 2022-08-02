package Epam.by.task3.main;
import java.util.Scanner;
import java.util.Random;


/*
Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
программа, а также ошибочные числа пользователя.
 */
public class Task312 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Угадайте число от 1 до 15");
        do {
            x = random.nextInt(15);
            System.out.print("Ваше число: ");
            y = sc.nextInt();
            System.out.println("Компьютер выбрал " + x);
        }
        while (x != y);

        System.out.println("Поздравляю, вы угадали!");
    }
}