package com.example.library.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.rest.model.Book;
import com.example.library.rest.service.BookService;


@RestController
@RequestMapping("/library/books")
public class BookController {
	
	
	@Autowired
	BookService bookService;
	
	@GetMapping
	public List<Book> getAllBooks() {
		return bookService.fetchAllBooks();
	}
	
	
}
