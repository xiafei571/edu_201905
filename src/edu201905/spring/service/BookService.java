package edu201905.spring.service;

import java.util.List;

import edu201905.spring.domain.BookInfo;

public interface BookService {

	List<BookInfo> getBookList();

	Integer addBook(BookInfo book);
}
