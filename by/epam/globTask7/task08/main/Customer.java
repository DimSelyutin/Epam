package by.epam.globTask7.task08.main;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

// 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
// метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
// методами. Задать критерии выбора данных и вывести эти данные на консоль.
// Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
// Найти и вывести:
// a) список покупателей в алфавитном порядке;
// b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class Customer implements Serializable{

    private static int ID = 1;
    
    public Customer(int _cardNumber, int _account) throws IOException{  
        
        GetName getname = new GetName();
        name = getname.getCradName();
        surname = getname.getCardSurname();
        
        id = ID++;
        cardNumber = _cardNumber;
        account = _account;
    }


    public Customer(String _name, String _surname,int _cardNumber, int _account){
        id = ID++;
        name = _name;
        surname = _surname;
        cardNumber = _cardNumber;
        account = _account;
        
    }
    
    public Customer addToList(ArrayList<Customer> customer) {
        customer.add(this);
        return this;
     }



    private int account;

    public int getAccount() {
        return account;
    }
    public void setAccount(int account) {
        this.account = account;
    }
    


    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }



    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    private String surname;

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }



    private int cardNumber;

    public int getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }


    

    

    public String toString(){
        String string = "";
        string = string + id + ":"+name+" "+surname+" \t: "+ cardNumber+" " + account;
        return string;
    }

    public void print(){
        System.out.println(toString());
    }



}
