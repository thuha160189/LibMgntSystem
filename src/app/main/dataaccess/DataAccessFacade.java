package app.main.dataaccess;

import java.util.ArrayList;
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

	

	

}
