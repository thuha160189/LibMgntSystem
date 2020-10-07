package app.main.model;

public class LibraryMember extends Person{
	private static final long serialVersionUID = -7206984963573838605L;
	public static final String STORAGE_TYPE = "LIBRARY_MEMBER";
	
	private String memberId;
	private CheckoutRecord checkoutRecord;
	public LibraryMember() {}
	
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

	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMemberId(Long valueOf) {
		// TODO Auto-generated method stub
		
	}

	public void setFirstName(String text) {
		// TODO Auto-generated method stub
		
	}

	public void setLastName(String text) {
		// TODO Auto-generated method stub
		
	}

	public void setPhone(String text) {
		// TODO Auto-generated method stub
		
	}
	



	

}
