package edu201905.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu201905.spring.domain.BookInfo;
import edu201905.spring.domain.DeptInfo;
import edu201905.spring.service.BookService;
import edu201905.util.Const;

@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String bookList(HttpServletRequest request, ModelMap model) {
		List<BookInfo> result = bookService.getBookList();
		model.addAttribute("result", result);
		return "book";
	}
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addBook(ModelMap model) {
		model.addAttribute("book", new BookInfo());
		model.addAttribute("status", Const.FormStatus.ADD);
		return "book_form";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addBook(@ModelAttribute("book") BookInfo book, HttpServletRequest request, ModelMap model,
			Integer pageIndex, Integer pageSize) {
		bookService.addBook(book);
		return "redirect:/book/list";
	}
}
