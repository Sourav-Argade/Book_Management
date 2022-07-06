package com.sourav.bookManagement.dao;

import java.util.ArrayList;

import com.sourav.bookManagement.entity.Book;


public class BookDao {
	private ArrayList<Book> blist = new ArrayList<Book>();

	public String addBook(Book b) {
		blist.add(b);
		return "Book added successfully...";
	}


	public Book viewBook(int regno) {
		for(Book b:blist)
		{
			if(b.getRegno() == regno)
			{
				return b;
			}
		}
		return null;
	}


	public ArrayList<Book> viewAllBooks() {
		return blist;
	}


	public String updateBook(Book b) {
		for(Book b1:blist)
		{
			if(b1.getRegno() == b.getRegno())
			{
				b1.setAuthor(b.getAuthor());
				b1.setCost(b.getCost());
				return "Book updated successfully...";
			}
		}
		blist.add(b);
		return "Book added successfully...";
	}


	public String deleteBook(int regno) {
		for(int i=0; i<blist.size(); i++)
		{
			if(blist.get(i).getRegno() == regno)
			{
				blist.remove(blist.get(i));
				return "Book deleted Successfully";
			}
		}
		return "Book not found";

	}
}

