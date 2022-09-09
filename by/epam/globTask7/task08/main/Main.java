package by.epam.globTask7.task08.main;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Comparator;
import java.util.Scanner;

public class Main implements Comparable<Customer>{
    public static void main(String[] args) throws IOException {
        // GetName getname = new GetName();
        ArrayList<Customer> customer = new ArrayList<>();
        Customer customer1 = new Customer(78954321,111).addToList(customer);
        Customer customer2 = new Customer(80006745,112).addToList(customer);
        Customer customer3 = new Customer(80006745,112).addToList(customer);
        Customer customer4 = new Customer(80006745,112).addToList(customer);
        Customer customer5 = new Customer(80006745,112).addToList(customer);
        Customer customer6 = new Customer(80006745,112).addToList(customer);
        Customer customer7 = new Customer("Kostya","Kitov" ,90004322,113).addToList(customer);
        
        customer.sort(Comparator.comparing(Customer::getName));
        for (Customer cus : customer) {
            cus.print();
        }

        System.out.println("Credit card in: ");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Try enter!");
            sc.next();
        }
        int oneNum = sc.nextInt();
        while (!sc.hasNextInt()) {
            System.out.println("Try enter!");
            sc.next();
        }
        int twoNum = sc.nextInt();
        int count = 0;
        for (Customer cus : customer) {
            if (cus.getCardNumber()>oneNum && cus.getCardNumber() < twoNum) {
                cus.print();
                count++;
            }
            if(count ==0) {
                System.out.println("No mathches found");
            } 
        }
    }

    @Override
    public int compareTo(Customer o) {
        return 0;
    }

}
