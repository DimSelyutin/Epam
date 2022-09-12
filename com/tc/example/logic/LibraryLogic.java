package com.tc.example.logic;

import java.util.ArrayList;
import java.util.List;

import com.tc.example.bean.Book;
import com.tc.example.bean.Library;

public class LibraryLogic {

	
	public List<Book> byAuthor(Library library, String author) {
		List<Book> booksByAuthor = new ArrayList<Book>();
		List<Book> books = library.getBooks();
		
		for (int i = 0; i < books.size(); i++) {
			List<String> authors = books.get(i).getAuthors();
			
			if (authors.contains(author)) {
				booksByAuthor.add(books.get(i));
			}
		}
		return booksByAuthor;
	}

	public List<Book> byPublishingHouse(Library library, String publishingHouse) { 
		List<Book> booksByPublishingHouse = new ArrayList<Book>();
		List<Book> books = library.getBooks();
		
		for (int i = 0; i < books.size(); i++) {
			if (publishingHouse.equals(books.get(i).getPublishingHouse())) {
				booksByPublishingHouse.add(books.get(i));
			}
		}
		return booksByPublishingHouse;
	}

	public List<Book> byPublicationYear(Library library, int publicationYear) { 
		List<Book> booksByPublicationYear = new ArrayList<Book>();
		List<Book> books = library.getBooks();
		
		for (int i = 0; i < books.size(); i++) {
			if (publicationYear < (books.get(i).getPublicationYear())) {
				booksByPublicationYear.add(books.get(i));
			}
		}
		return booksByPublicationYear;
	}
}
