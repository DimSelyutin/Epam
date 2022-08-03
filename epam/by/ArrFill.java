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
    public Double[] arraysDuoble(int x){
        Random rand = new Random();
        Double[] arr = new Double[x];
        for (int i = 0; i < x; i++) {
            arr[i] = rand.nextDouble(-100,100);
        }
        return arr;
    }
    public int[] arrSubseq(int x){
        Random rand = new Random();
        int[] arr = new int[x];
        for (int i = rand.nextInt(100), j = 0; j < arr.length; j++) {
            arr[j] = i;
            i++;
        }
        return arr;
    }
}