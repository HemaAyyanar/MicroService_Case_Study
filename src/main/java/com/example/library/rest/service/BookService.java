package com.example.library.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.rest.model.Book;
import com.example.library.rest.repository.BookRepository;



@Service
public class BookService {
	
	
	@Autowired
    BookRepository bookRepository;

	
	public List<Book> fetchAllBooks() {
		return bookRepository.findAll();
	}


	public Book getBook(Integer bookId) {
		// TODO Auto-generated method stub
		return bookRepository.getById(bookId);
	}
}
