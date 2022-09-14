package by.epam.globTask7.task09;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Serializable{

    
    public static void main(String[] args) {

        ArrayList<Book> book = new ArrayList<>();
        new Book("BokName", "Author1", "Publisher1", 1999, 150, 300).addToList(book);
        new Book("BokName1", "Author1", "Publisher2", 2009, 150, 300).addToList(book);
        new Book("BokName2", "Author3", "Publisher3", 2005, 150, 300).addToList(book);
        new Book("BokName3", "Author4", "Publishe4r", 1986, 150, 300).addToList(book);
        new Book("BokName4", "Author5", "Publisher5", 1999, 150, 300).addToList(book);

        AgregatorBook ab = new AgregatorBook();
        System.out.println("Search by author:_\nEnter the name of author: ");
        Scanner sc = new Scanner(System.in);

        String author = sc.nextLine();
        ab.AuthorBook(book, author);

        System.out.println("Search about year of publish: ");

        while(!sc.hasNextInt()){
            System.out.println("Enter a yaer! For example (1999).");
            sc.nextInt();
        }

        int num = sc.nextInt();
        ab.publisherBook(book, num);


        System.out.println("Search all book after year of publish: ");

        while(!sc.hasNextInt()){
            System.out.println("Enter a yaer! For example (1999).");
            sc.next();
        }

        num = sc.nextInt();
        ab.publishYear(book, num);

    }
 
}
