package by.epam.globTask7.task09;

import java.io.Serializable;
import java.util.ArrayList;

// Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
// toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
// Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
// Найти и вывести:
// a) список книг заданного автора;
// b) список книг, выпущенных заданным издательством;
// c) список книг, выпущенных после заданного года.

public class Book implements Serializable{//id, name,author,publisher, creatYear, pages,price,
    
    public Book(){
        id = ID;
        bookName = "book";
        author = "Author";
    }


    public Book(String _name, String _author, String _publisher, int _createYear, int _pages, int _price){
        id = ID++;
        bookName = _name;
        author = _author;
        createYear = _createYear;
        pages = _pages;
        price = _price;
    }

    private static int ID=0;
    
    private int id;
    public int getId() {
        return id;
    }



    private String bookName;

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }




    private String author;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }



    private String publisher;

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }



    private int createYear;

    public int getCreateYear() {
        return createYear;
    }
    public void setCreateYear(int createDate) {
        this.createYear = createDate;
    }



    private int pages;

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }


    private int price;

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


    public void printBook(){
        System.out.println(toString());
    }

    public String toString(){
        String string = "";
        string = string+id+" "+bookName+" "+author+" "+createYear+" "+ pages +" "+price;
        return string;
    }


    public Book addToList(ArrayList<Book> book) {
        book.add(this);
        return this;
    }
    
}
