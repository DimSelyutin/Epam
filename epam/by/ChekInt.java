package epam.by;
import java.util.Scanner;
public class ChekInt {
    public int chekInt(){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        if (!sc.hasNextInt()) {
            System.out.println("Видимо вы вводите не число :(");
            
        } else {
            x = sc.nextInt();
        }
        return x;
    }
}