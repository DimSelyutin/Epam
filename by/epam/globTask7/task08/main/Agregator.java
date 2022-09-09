package by.epam.globTask7.task08.main;


import java.util.Comparator;
import java.util.List;


public class Agregator implements Comparable<Customer>{
    public Agregator(){

    }
    
    
    public void sortAlph(List<Customer> customer){
        customer.sort(Comparator.comparing(Customer::getName));
        for (Customer cus : customer) {
            cus.print();
        }
    }


    public void cardSearch(List<Customer> customer, int num1, int num2){
        for (Customer cus : customer) {
            if (cus.getCardNumber()>num1 && cus.getCardNumber() < num2) {
                cus.print();
            }
        }
    }


    @Override
    public int compareTo(Customer o) {
        
        return 0;
    }
    
}
