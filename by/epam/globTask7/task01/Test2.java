package by.epam.task7.main.task1.main;
public class Test2 {
    private int a1;
    private int b1;


    public Test2(int x, int y){
        a1 = x;
        b1 = y;
    }

    public Test2() {
        a1 = 900;
        b1 = 1000;
    }
    public int getA(){
            return a1;
    }
    
    public int getB(){
        return b1;
    }

    public void setA(int _a1){
            a1=_a1;
    }
    public void setB(int _b1){
            b1=_b1;
        }

        

        public void printA(){
            System.out.println(a1);
        }
        public void printB(){
            System.out.println(b1);
        }
}
