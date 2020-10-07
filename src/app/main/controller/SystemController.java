package app.main.controller;

import app.main.dataaccess.DataAccess;
import app.main.dataaccess.DataAccessFacade;
import app.main.model.Book;
import app.main.model.CheckoutRecord;
import app.main.model.LibraryMember;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import app.main.model.User;

public class SystemController {
	private DataAccess dataaccess = new DataAccessFacade();
	
	//Book controller
	public ObservableList<Book> getAllBooks(){
		// Add some sample data
		ObservableList<Book> listBooks = FXCollections.observableArrayList();
		dataaccess.getAllBooks().forEach(member -> {
			listBooks.add(member);
		});
    	return listBooks;
	}
	
	public void addNewBook(Book book) {
		dataaccess.addNewBook(book);
	}
	
	public void updateBook(Book book) {
		dataaccess.updateBook(book);
	}
	
	public boolean deleteBook(Book libmem) {
		return true;
	}// User controller
	public User checkUser(User user) {
		return dataaccess.checkUser(user);
	}
	
	public User getUser(String userName) {
		return dataaccess.getUser(userName);
	}
	
	public void addNewUser(User user) {
		dataaccess.addNewUser(user);
	}

	

}
