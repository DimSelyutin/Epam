package by.epam.globTask7.task08.main;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;


public class Main implements Serializable{
    public static void main(String[] args) throws IOException {
        ArrayList<Customer> customer = new ArrayList<>();
        new Customer(78954321,111).addToList(customer);
        new Customer(80006745,112).addToList(customer);
        new Customer(30006745,113).addToList(customer);
        new Customer(60006745,115).addToList(customer);
        new Customer(50006745,116).addToList(customer);
        new Customer(80006745,117).addToList(customer);
        new Customer("Kostya","Kitov" ,90004322,118).addToList(customer);
        

        Agregator ag = new Agregator();
        System.out.println("Found users: \n");
        ag.cardSearch(customer, 30000000, 70000000);
        System.out.println("\nSorted users: \n");
        ag.sortAlph(customer);
        
    }


}
