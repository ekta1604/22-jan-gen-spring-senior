package com;

public class SetterInjection {

	public static void main(String[] args) {
		UserPayment userPayment = new UserPayment();
		// credit card
		CreditCard cc = new CreditCard();
		userPayment.setCc(cc);
		userPayment.creditCard();
		userPayment.saveCreditcard();

		UserPayment userPayment1 = new UserPayment();
		userPayment1.cod();
	}
}

class UserPayment {

	// optional
	private UPI upi;
	private CreditCard cc;

	public UPI getUpi() {
		return upi;
	}

	public void saveCreditcard() {
		// insert cc
	}

	public void setUpi(UPI upi) {
		this.upi = upi;
	}

	public CreditCard getCc() {
		return cc;
	}

	public void setCc(CreditCard cc) {
		this.cc = cc;
	}

	void cod() {

	}

	void upi() {

	}

	void creditCard() {
		///
		cc.chargeCreditCard();
	}
}

class UPI {
	private String upi;
	//
}

class CreditCard {
	private String ccNumber, expDate, cvv;

	//
	void chargeCreditCard() {
		System.out.println("amount deducted....");
	}

}