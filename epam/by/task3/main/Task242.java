package epam.by.task3.main;
import java.util.Scanner;
// Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать
// его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным
// числом.
public class Task242 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        int x = sc.nextInt();
        int count =0;
        for (int i = 0; i <= x; i++) {
            if (i%2==0) {
                count+=i;
            }
        }
        String str = String.valueOf(count);
        String str2 = new StringBuilder(str).reverse().toString();
        System.out.println(str2);
    }
}
