package app.main.model;

import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> checkoutRecordEntry;
	

	public CheckoutRecord(List<CheckoutRecordEntry> checkoutRecordEntry) {
		super();
		this.checkoutRecordEntry = checkoutRecordEntry;
	}

	public List<CheckoutRecordEntry> getCheckoutRecordEntry() {
		return checkoutRecordEntry;
	}

	public void setCheckoutRecordEntry(List<CheckoutRecordEntry> checkoutRecordEntry) {
		this.checkoutRecordEntry = checkoutRecordEntry;
	}

	

	
	

}
