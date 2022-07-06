package com.sourav.bookManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private int regno;
	private String author;
	private double cost;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int regno, String author, double cost) {
		super();
		this.regno = regno;
		this.author = author;
		this.cost = cost;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book [regno=" + regno + ", author=" + author + ", cost=" + cost + "]";
	}
	
}
