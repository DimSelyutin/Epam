package epam.by.task3.main;
import java.util.Scanner;

// Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное
// данное количество лепестков п.
public class Task24{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во лепистков на ромашке: ");
        Task8 ch = new Task8();//проверка числа
        int a = ch.chekInt();
        if (a%2==0) {
            System.out.println("Не люьит :(");
        } else {
            System.out.println("Любит!");
        }
    } 
}
