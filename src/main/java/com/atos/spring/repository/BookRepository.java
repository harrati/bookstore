package com.atos.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.atos.spring.beans.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	List<Book> findByName(String name);
}
