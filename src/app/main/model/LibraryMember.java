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

	@Override
	public String toString() {
		return "LibraryMember [memberId=" + memberId + ", checkoutRecord=" + checkoutRecord + "]"+
	
"Address [street=" + this.getAddress().getStreet() + ", city=" + this.getAddress().getCity()  + ", state=" + this.getAddress().getState() + ", zip=" + this.getAddress().getZip()  + "]";
	}

	



	

}
