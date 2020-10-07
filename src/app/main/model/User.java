package app.main.model;

import java.util.List;

public class User {
	private String userName;
	private String password;
	private Role role;
	
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	public User(String userName, String password, Role role) {
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
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	

}
