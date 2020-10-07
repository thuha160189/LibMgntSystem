package app.main.model;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private BookCopy bookCopy;
	
	public CheckoutRecordEntry(LocalDate checkoutDate, LocalDate dueDate, BookCopy bookCopy) {
		super();
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.bookCopy = bookCopy;
	}
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public BookCopy getBookCopy() {
		return bookCopy;
	}
	public void setCheckoutDate(LocalDate now) {
		// TODO Auto-generated method stub
		
	}
	public void setDueDate(LocalDate value) {
		// TODO Auto-generated method stub
		
	}
	
	

}
