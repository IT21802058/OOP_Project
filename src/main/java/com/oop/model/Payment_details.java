package com.oop.model;

/**
 * This is the Service model class
 */
public class Payment_details {
	
	/*
	 * Declaring class variables
	 */
	private String NIC;
	private String name;
	private String email;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String bankname;
	private String cardname;
	private String cardnumber;
	private String expmonth;
	private String expyear;
	private String cvv;
	
	public String getNIC() {
		return NIC;
	}

	public void setNIC(String nIC) {
		NIC = nIC;
	}
	
	/*
	 * constructor for Service
	 */
	/*public Payment_details(String nIC, String payType, String cardNo, String cvc, String exdate, String oname) {
		NIC = nIC;
		this.payType = payType;
		this.cardNo = cardNo;
		this.cvc = cvc;
		this.exdate = exdate;
		Oname = oname;
	}
*/
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getBankname() {
		return bankname;
	}


	public void setBankname(String bankname) {
		this.bankname = bankname;
	}


	public String getCardname() {
		return cardname;
	}


	public void setCardname(String cardname) {
		this.cardname = cardname;
	}


	public String getCardnumber() {
		return cardnumber;
	}


	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}


	public String getExpmonth() {
		return expmonth;
	}


	public void setExpmonth(String expmonth) {
		this.expmonth = expmonth;
	}


	public String getExpyear() {
		return expyear;
	}


	public void setExpyear(String expyear) {
		this.expyear = expyear;
	}


	public String getCvv() {
		return cvv;
	}


	public void setCvv(String cvv) {
		this.cvv = cvv;
	}


	public String toString() {
		return "Customer [NIC="+NIC+",Name = " + name + ",Email="+email+",Address = " + address + ",City="+city+",State="+state+",Zip="+zip+",Bank name="+bankname+",Card name="+cardname+",Card number="+cardnumber+",Expire month="+expmonth+",Expire year="+expyear+",Cvv="+cvv+"]";
}
}

