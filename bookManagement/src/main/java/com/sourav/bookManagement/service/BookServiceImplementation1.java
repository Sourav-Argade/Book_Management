package com.sourav.bookManagement.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.sourav.bookManagement.dao.BookDao;
import com.sourav.bookManagement.entity.Book;

public class BookServiceImplementation1 implements bookService{
	@Autowired
	private BookDao bdao;

	@Override
	public String addBook(Book b) {
		return bdao.addBook(b);
	}

	@Override
	public Book viewBook(int regno) {
		return bdao.viewBook(regno);
	}

	@Override
	public ArrayList<Book> viewAllBooks() {
		return bdao.viewAllBooks();
	}

	@Override
	public String updateBook(Book b) {
		return bdao.updateBook(b);
	}

	@Override
	public String deleteBook(int regno) {
		return bdao.deleteBook(regno);
	}

}
