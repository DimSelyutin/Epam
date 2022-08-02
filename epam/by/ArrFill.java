package epam.by;
import java.util.Random;
public class ArrFill{
    public static void main(String[] args){
        
       
    }
    public int[] arrays(int x){
        Random rand = new Random();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
}