package com.sourav.bookManagement.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.sourav.bookManagement.dao.BookRepo;
import com.sourav.bookManagement.entity.Book;

@Service
@Primary
public class BookServiceImplementation2 implements bookService{
	@Autowired
	BookRepo brepo;

	@Override
	public String addBook(Book b) {
		brepo.save(b);
		return "Book Added Successfully";
	}

	@Override
	public Book viewBook(int regno) {
		return brepo.findById(regno).orElse(null);
	}

	@Override
	public ArrayList<Book> viewAllBooks() {
		return (ArrayList<Book>) brepo.findAll();
	}

	@Override
	public String updateBook(Book b) {
		Book b1 = brepo.findById(b.getRegno()).orElse(null);
		if(b1 != null)
		{
			brepo.delete(b1);
		}
		brepo.save(b);
		return "Book updated successfully..";
	}

	@Override
	public String deleteBook(int regno) {
		Book b1 = brepo.findById(regno).orElse(null);
		if(b1 != null)
		{
			brepo.delete(b1);
			return "Book deleted Successfully..";
		}
		return "Book not found";
	}

}
