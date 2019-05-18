package edu201905.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu201905.spring.domain.BookInfo;
import edu201905.spring.model.mapper.BookMapper;
import edu201905.spring.service.BookService;

@Component("bookService")
public class BookServicelmpl implements BookService {
	@Autowired
	private BookMapper bookMapper;

	@Override
	public List<BookInfo> getBookList() {
		return bookMapper.getBookInfoList();

	}
}
