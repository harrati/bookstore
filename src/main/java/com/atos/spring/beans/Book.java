package com.atos.spring.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	String name;
	String description;
	String isbn;
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer id, String name, String description, String isbn) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.isbn = isbn;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
