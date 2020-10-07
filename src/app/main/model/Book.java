package app.main.model;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {
	private static final long serialVersionUID = -284993669099407157L;
	private String title;
	private String isbn;
	private int maxCheckoutLength;
	private List<Author> author;
	private List<BookCopy> bookCopy;
	public static final String TYPE = "BOOK";
	
	public List<BookCopy> getBookCopy() {
		return bookCopy;
	}
	public Book(String title, String isbn, int maxCheckoutLength, List<Author> author, List<BookCopy> bookCopy) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.maxCheckoutLength = maxCheckoutLength;
		this.author = author;
		this.bookCopy = bookCopy;
	}
	public String getTitle() {
		return title;
	}
	public String getIsbn() {
		return isbn;
	}
	public int getMaxCheckoutLength() {
		return maxCheckoutLength;
	}
	public List<Author> getAuthor() {
		return author;
	}
	
	

}
