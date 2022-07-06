package com.sourav.bookManagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.sourav.bookManagement.entity.Book;

public interface BookRepo extends CrudRepository<Book,Integer>{

}
