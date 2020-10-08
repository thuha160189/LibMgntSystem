package app.main.model;

import java.util.List;

public class Book {
	private String title;
	private long isbn;
	private int maxCheckoutLength;
	private List<Author> author;
	
	public Book(String title, long isbn, int maxCheckoutLength, List<Author> author) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.maxCheckoutLength = maxCheckoutLength;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public long getIsbn() {
		return isbn;
	}
	public int getMaxCheckoutLength() {
		return maxCheckoutLength;
	}
	public List<Author> getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", maxCheckoutLength=" + maxCheckoutLength + ", author="
				+ author + "]";
	}
	
	
	

}
