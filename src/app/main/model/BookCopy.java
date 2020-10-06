package app.main.model;

public class BookCopy {
	private int copyNum;
	private Book book;
	public BookCopy(int copyNum, Book book) {
		super();
		this.copyNum = copyNum;
		this.book = book;
	}
	public int getCopyNum() {
		return copyNum;
	}
	public Book getBook() {
		return book;
	}
	

}
