package com.example.library.rest.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.library.rest.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{


	
	
}
