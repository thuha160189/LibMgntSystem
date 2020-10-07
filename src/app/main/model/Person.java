package app.main.model;

public class Person {
	private String fname;
	private String lname;
	private String phone;
	private Address address;
	
	public Person() {
		this.fname = "";
		this.lname = "";
		this.address = null;
		this.phone = "";
	}

	public Person(String fname, String lname, String phone) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public Address getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}
	
	

}
