package com.sourav.bookManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sourav.bookManagement.entity.Book;
import com.sourav.bookManagement.service.bookService;

@Controller
public class BookController {
	@Autowired
	private bookService bservice;
	@RequestMapping("new")
	public String getNew()
	{
		return "new.jsp";
	}
	
	@RequestMapping("homeBook")
	public String getBookHome()
	{
		return "bookHome.jsp";
	}
	
	@RequestMapping("addBook")
	@ResponseBody
	public String addCar(Book b)
	{
		return bservice.addBook(b);
	}
	
	@RequestMapping("viewBook")
	public ModelAndView viewBook(int regno)
	{
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("displaybook.jsp");
		mvc.addObject("mode", "single");
		
		Book b = bservice.viewBook(regno);
		if(b != null)
		{
				mvc.addObject("flag", true);
				mvc.addObject("result",b);
				return mvc;
		}
		
		mvc.addObject("flag", false);
		mvc.addObject("result", "Book not found...");
		return mvc;
	}
	
	@RequestMapping("viewAllBooks")
	public ModelAndView viewAllBook()
	{
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("displaybook.jsp");
		mvc.addObject("mode", "list");
		mvc.addObject("result",bservice.viewAllBooks());
		return mvc;
	}
	
	@RequestMapping("updateBook")
	@ResponseBody
	public String updateCar(Book b)
	{	
		return bservice.updateBook(b);	
	}
	
	@RequestMapping("deleteBook")
	@ResponseBody
	public String deleteBook(int regno)
	{
		return bservice.deleteBook(regno);
	}
	
}

