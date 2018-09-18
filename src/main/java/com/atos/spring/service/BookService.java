package com.atos.spring.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atos.spring.beans.Book;
import com.atos.spring.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	//@Autowired
	private List<Book> books = Arrays.asList(
			new Book(1, "PHP", "PHP description", "1-isbn"), 
			new Book(2, "C++", "C++ description", "2-isbn"),
			new Book(3, "Java", "Java description", "3-isbn")
			);

	
	public List<Book> loadAll() {
		return bookRepository.findAll();
	}
	
	public Book createBook(Book book) {
		bookRepository.save(book);
		return book;
	}
	
	
	public Book loadById(Integer id) {
		return books.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		//return bookRepository.findById(id);
	}
	
	public Book updateBook(Book book) {
		bookRepository.save(book);
		return book;
	}
	
	public void deleteBook(Integer id) {
		bookRepository.deleteById(id);
	}
	
}
