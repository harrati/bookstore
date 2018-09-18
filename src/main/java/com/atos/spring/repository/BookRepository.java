package com.atos.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atos.spring.beans.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
