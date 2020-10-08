package app.main.model;

import java.util.List;

public class User {
	private String userName;
	private String password;
	private List<Role> role;
	public User(String userName, String password, List<Role> role) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public List<Role> getRole() {
		return role;
	}
	public void setRole(List<Role> role) {
		this.role = role;
	}
	
	

}
