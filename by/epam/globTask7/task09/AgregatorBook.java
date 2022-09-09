package by.epam.globTask7.task09;

import java.util.List;

public class AgregatorBook implements Comparable<Book>{
    public AgregatorBook(){
        
    }


    public void AuthorBook(List<Book> book, String author){
        for (Book b : book) {
            if (b.getAuthor().equals(author)) {
                b.printBook();
            }
        }
    }

    public void publisherBook(List<Book> book, int year){
        for (Book b : book) {
            if (b.getCreateYear() == year) {
                b.printBook();
            }
        }
    }

    public void publishYear(List<Book> book, int year){
        for (Book b : book) {
            if (b.getCreateYear() >= year) {
                b.printBook();
            }
        }
    }

    @Override
    public int compareTo(Book o) {
        
        return 0;
    }
}
