package app.main.dataaccess;

import java.util.Collection;

import app.main.model.Book;
import app.main.model.CheckoutRecord;
import app.main.model.LibraryMember;
import app.main.model.User;

public class DataAccessFacade implements DataAccess{

	@Override
	public void addNewBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(Book newBook) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book findBookById(String id) {
		// TODO Auto-generated method stub
		return null;
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
