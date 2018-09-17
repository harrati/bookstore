package com.atos.spring.service;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import com.atos.spring.beans.Book;

public class BookService {

	@Autowired
	private List<Book> books = Arrays.asList(
			new Book(1, "PHP", "PHP description", "1-isbn"), 
			new Book(2, "C++", "C++ description", "2-isbn"),
			new Book(3, "Java", "Java description", "3-isbn")
			);

	public List<Book> getAll(){
		
		return books;
	}
	
}
