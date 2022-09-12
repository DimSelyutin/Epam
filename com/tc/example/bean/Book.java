package com.tc.example.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idBook;
	private String title;
	private List<String> authors;
	private String publishingHouse;
	private int publicationYear;
	private int numbOfPages;
	private int price;
	private String bindingType;
	
	public Book() {}

	public Book(int idBook, String title, List<String> authors, String publishingHouse, int publicationYear,
			int numbOfPages, int price, String bindingType) {
		this.idBook = idBook;
		this.title = title;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.publicationYear = publicationYear;
		this.numbOfPages = numbOfPages;
		this.price = price;
		this.bindingType = bindingType;
	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public int getNumbOfPages() {
		return numbOfPages;
	}

	public void setNumbOfPages(int numbOfPages) {
		this.numbOfPages = numbOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(authors, bindingType, idBook, numbOfPages, price, publicationYear, publishingHouse, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authors, other.authors) && Objects.equals(bindingType, other.bindingType)
				&& idBook == other.idBook && numbOfPages == other.numbOfPages && price == other.price
				&& publicationYear == other.publicationYear && Objects.equals(publishingHouse, other.publishingHouse)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", title=" + title + ", authors=" + authors + ", publishingHouse="
				+ publishingHouse + ", publicationYear=" + publicationYear + ", numbOfPages=" + numbOfPages + ", price="
				+ price + ", bindingType=" + bindingType + "]";
	}


}
