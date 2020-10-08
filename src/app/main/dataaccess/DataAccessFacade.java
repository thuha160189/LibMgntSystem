package app.main.dataaccess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


import app.main.model.*;

public class DataAccessFacade implements DataAccess{
	
	public List<User> loadUsers(){
		
		List<Role> admin= new ArrayList();
		admin.add(Role.ADMINISTRATOR);	
		User u1=new User("admin", "pass",admin );
		
		
		List<Role> librarian= new ArrayList();
		librarian.add(Role.LIBRARIAN);	
		User u2=new User("librian", "pass",librarian );
		
		List<Role> both= new ArrayList();
		both.add(Role.LIBRARIAN);
		both.add(Role.ADMINISTRATOR);	
		User u3=new User("both", "pass",both);
		
		List<User> users=new ArrayList<User>();
			users.add(u1);
			users.add(u2);
			users.add(u3);
			
			System.out.println("Loading users");
			
	  return users;
		
		
	}
	
public List<Book> loadBooks(){
	Author a1 = new Author("Jonas", "Carlos", "310-231-5545", "Phd");
	Author a2 = new Author("Moahan", "Lar", "310-231-5045", "Beachlor");
	Author a3 = new Author("Hale", "Carlos", "310-231-5545", "Dr.Computer Science");
	Author a4 = new Author("Hailian", "Barbara", "310-231-5045", "Phd");
	Author a5 = new Author("Ghimari", "Barbara", "310-231-5045", "Master");

	
		List<Author> la1 = new ArrayList<>();
		la1.add(a1);
		la1.add(a2);
		List<Author> la2 = new ArrayList<>();
		la2.add(a3);
		la2.add(a4);
		List<Author> la3 = new ArrayList<>();
		la3.add(a3);
		la3.add(a5);


		Book b1 = new Book("Book1 ", 999999,  21, la1);
		Book b2 = new Book("Book2 ", 888888,  22, la2);
		Book b3 = new Book("Book2 ", 777777,  23, la3);

		
		List<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		
	
		
	  return books;
		
		
	}
	
	public Role[] LoadRole(){
		
		Role[] roles= {Role.ADMINISTRATOR,Role.LIBRARIAN};
		
		return roles;
		
	}
	
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
	
	private User loginUser;

	public void setLoginUser(User user) {
		this.loginUser=user;
		
	}
	
	public String getLoginUserUsername() {
		return this.loginUser.getUserName();
	}

	@Override
	public void addNewLibriaryMember() {
		// TODO Auto-generated method stub
		
	}

	

	

	

}
