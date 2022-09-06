package epam.by.task7.main;

public class Test1 {
    private int a;
    private int b;

    public void setA(int _a){
        _a = a;
    }

    public int getA(){
        return a;
    } 

    public void setB(int _b){
        _b = b;
    }

    public int getB(){
        return b;
    } 
    public  void print(){
        System.out.println(getA());
        System.out.println(getB());

    }

    public int sum(int res){
        res = a+b;
        return res;
    }


}
