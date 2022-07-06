package com.sourav.bookManagement.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sourav.bookManagement.entity.Book;

@Service
public interface bookService {
	String addBook(Book b);
	Book viewBook(int regno);
	ArrayList<Book> viewAllBooks();
	String updateBook(Book b);
	String deleteBook(int regno);
}
