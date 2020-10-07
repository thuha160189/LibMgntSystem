package app.main.dataaccess;

import java.util.Collection;
import java.util.HashMap;

import app.main.model.Book;
import app.main.model.CheckoutRecord;
import app.main.model.LibraryMember;
import app.main.model.User;
import app.main.utils.FileUtils;

public class DataAccessFacade implements DataAccess {
	HashMap<String, Book> books;

	@Override
	public void addNewBook(Book book) {
		books.put(book.getIsbn(), book);
	}

	@Override
	public void updateBook(Book newBook) {
		addNewBook(newBook);	
	}

	@Override
	public Book searchBook(String isbn) {
		// TODO Auto-generated method stub
		HashMap<String, Book> bookmap = (HashMap<String, Book>) readData(books, Book.TYPE);
		return bookmap.get(books);
	}

	private Object readData(Object data, String type) {
		// TODO Auto-generated method stub
		if (data !=null) {
			return data;
		}
		//read book data from file in the first time
		try {
					
				Object result = FileUtils.readObject(type);
				data = result != null ? result : new HashMap();
					
			} catch (Exception e) {
					e.printStackTrace();
			}
				
			return data;
	}

	@Override
	public Collection<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long addNewLibraryMember(LibraryMember libraryMember) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateLibraryMember(LibraryMember libraryMember) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LibraryMember findLibraryMemberById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<LibraryMember> findAllMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void checkout(CheckoutRecord checkoutRecord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CheckoutRecord findCheckOutRecordByMemberId(Long memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<CheckoutRecord> getCheckoutRecordEntries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNewUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User checkUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	

}
