package by.epam.globTask7.task01;

public class Task1{
    public static void main(String args[]){
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();

        test1.setA(9);
        test1.setB(3);
        test1.printA();
        System.out.println(test1.sumary());
        System.out.println(test1.procl());

        System.out.println(test2.getA());
   }
}

