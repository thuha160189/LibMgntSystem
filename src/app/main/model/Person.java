package app.main.model;

public class Person {
	private String fname;
	private String lname;
	private String phone;
	private Address address;

	public Person(String fname, String lname, String phone, Address address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.address = address;
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
