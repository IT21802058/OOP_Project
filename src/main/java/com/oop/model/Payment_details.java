package com.oop.model;

/**
 * This is the Service model class
 */
public class Payment_details {
	
	/*
	 * Declaring class variables
	 */
	private String NIC;
	private String payType;
	private String cardNo;
	private String cvc;
	private String exdate;
	private String Oname;
	
	/*
	 * constructor for Service
	 */
	public Payment_details(String nIC, String payType, String cardNo, String cvc, String exdate, String oname) {
		NIC = nIC;
		this.payType = payType;
		this.cardNo = cardNo;
		this.cvc = cvc;
		this.exdate = exdate;
		Oname = oname;
	}

	/*
	 * return NIC
	 */
	public String getNIC() {
		return NIC;
	}

	/*
	 * Assign NIC value
	 */
	public void setNIC(String nIC) {
		NIC = nIC;
	}

	/*
	 * return payment type
	 */
	public String getPayType() {
		return payType;
	}

	/*
	 * Assign payment type
	 */
	public void setPayType(String payType) {
		this.payType = payType;
	}

	/*
	 * return card number
	 */
	public String getCardNo() {
		return cardNo;
	}

	/*
	 * Assign card number
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/*
	 * return cvc
	 */
	public String getCvc() {
		return cvc;
	}

	/*
	 * Assign cvc
	 */
	public void setCvc(String cvc) {
		this.cvc = cvc;
	}

	/*
	 * return expire date
	 */
	public String getExdate() {
		return exdate;
	}

	/*
	 * Assign expire date
	 */
	public void setExdate(String exdate) {
		this.exdate = exdate;
	}

	/*
	 * return owner name
	 */
	public String getOname() {
		return Oname;
	}

	/*
	 * Assign owner name
	 */
	public void setOname(String oname) {
		Oname = oname;
	}
	
	/*
	 * return string
	 */
	public String toString() {
		return "Customer NIC = " + NIC + "\n" + "Payment Type = " + payType + "\n" + "Card no = " + cardNo + "\n"
				+ "CVC = " + cvc + "\n" + "Expire date = " + exdate + "\n" + "Owner Name = "
				+ Oname + "\n";
	}
}
