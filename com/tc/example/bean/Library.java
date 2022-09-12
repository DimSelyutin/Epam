package com.tc.example.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library implements Serializable {  
	private static final long serialVersionUID = 1L;

	private List<Book> books;

	public Library() {
		books = new ArrayList<Book>();
	}

	public Library(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void add(Book book) {
		books.add(book);
	}

	public void delete(Book book) {
		books.remove(book);
	}


	@Override
	public int hashCode() {
		return Objects.hash(books);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return Objects.equals(books, other.books);
	}

	@Override
	public String toString() {
		return "Library [books=" + books + "]";
	}	

}
