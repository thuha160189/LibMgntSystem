package app.main.model;

public class LibraryMember extends Person{
	private String memberId;
	private CheckoutRecord checkoutRecord;
	
	public LibraryMember(String id, String fname, String lname, String phone) {
		super(fname, lname, phone);
		this.memberId = id;
		// TODO Auto-generated constructor stub
	}

	public String getMemberId() {
		return memberId;
	}

	public CheckoutRecord getCheckoutRecord() {
		return checkoutRecord;
	}
	



	

}
