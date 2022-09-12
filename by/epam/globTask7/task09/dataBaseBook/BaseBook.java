package by.epam.globTask7.task09.dataBaseBook;

import java.util.ArrayList;

import by.epam.globTask7.task09.Book;

public class BaseBook {
    public BaseBook(){
        ArrayList<Book> book = new ArrayList<>();
        new Book("BokName", "Author1", "Publisher1", 1999, 150, 300).addToList(book);
        new Book("BokName1", "Author2", "Publisher2", 2009, 150, 300).addToList(book);
        new Book("BokName2", "Author3", "Publisher3", 2005, 150, 300).addToList(book);
        new Book("BokName3", "Author4", "Publishe4r", 1986, 150, 300).addToList(book);
        new Book("BokName4", "Author5", "Publisher5", 1999, 150, 300).addToList(book);
        
    }
}
