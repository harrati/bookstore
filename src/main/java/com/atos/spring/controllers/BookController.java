package com.atos.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atos.spring.beans.Book;
import com.atos.spring.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping("/books")
	public List<Book> loadAll() {
		return bookService.loadAll();
	}

	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public Book createBook(@RequestBody Book book) {
		bookService.createBook(book);
		return book;
	}

	@RequestMapping("/books/{id}")
	public Book loadById(@PathVariable Integer id) {
		return bookService.loadById(id);
	}

	@RequestMapping(value = "/books", method = RequestMethod.PUT)
	public Book updateBook(@RequestBody Book book) {
		bookService.updateBook(book);
		return book;
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
	public void deleteBook(@PathVariable Integer id) {
		bookService.deleteBook(id);
	}
}
