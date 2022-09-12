package com.tc.example.main;

import java.util.List;

import com.tc.example.bean.Book;
import com.tc.example.bean.Library;
import com.tc.example.logic.LibraryLogic;
import com.tc.example.view.LibraryConsoleOutput;

public class Main {
	
	public static void main(String[] args) {
		
		LibraryLogic logic = new LibraryLogic();
		LibraryConsoleOutput output = new LibraryConsoleOutput();
		
		Library lib = new Library();
		// lib.add(new Book(... ));
		// lib.add(....);
		
		List<Book> books = logic.byPublicationYear(lib, 0);
		
		output.printAsTable("Find by ....", books);
		
	}

}
