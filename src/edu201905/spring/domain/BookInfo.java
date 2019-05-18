package edu201905.spring.domain;

public class BookInfo {
	private Integer bookId;
	private String bname;
	private String btype;
	private Double price;
	private String author;
	
	@Override
	public String toString() {
		return "StudentInfo [bookId=" + bookId + ", bname=" + bname + ", btype=" + btype + ", price=" + price
				+ ", author=" + author + "]";
	}

	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBtype() {
		return btype;
	}

	public void setBtype(String btype) {
		this.btype = btype;
	}
	
}
