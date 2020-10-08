package app.main.model;

public class Author extends Person {
	private String credentials;
	
	public Author(String fname, String lname, String phone, String credential) {
		super(fname, lname, phone);
		this.credentials = credential;
		// TODO Auto-generated constructor stub
	}

	public String getCredentials() {
		return credentials;
	}

	@Override
	public String toString() {
		return "Author [credentials=" + credentials + "]";
	}
	
	
	

	

}
