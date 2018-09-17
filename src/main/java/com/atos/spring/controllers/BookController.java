package com.atos.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atos.spring.beans.Book;

@RestController
public class BookController {
	
	@RequestMapping("/books")
	public Book getAllBooks() {
		return new Book();
	}
}
