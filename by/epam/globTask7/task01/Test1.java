package by.epam.globTask7.task01;

public class Test1 {
    private int a;
    private int b;

   public int getA(){
        return a;
   }
   
   public int getB(){
    return b;
   }

   public void setA(int _a){
        a=_a;
   }
   public void setB(int _b){
        b=_b;
    }

    public int sumary(){
        
        return a+b;
    }

    public int procl(){
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }

    public void printA(){
        System.out.println(a);
    }
    public void printB(){
        System.out.println(b);
    }
}
