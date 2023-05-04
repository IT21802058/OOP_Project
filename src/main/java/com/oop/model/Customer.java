package com.oop.model;
/**
 * This is the Customer model class
 */
public class Customer extends User{
	/*
	 * Declaring class variable
	 */
	private String city;

	/*
	 * constructor for Customer
	 */
	public Customer(String nIC, String name, String phone, String email, String username, String password,
			String usertype, String city) {
		NIC = nIC;
		Name = name;
		Phone = phone;
		this.email = email;
		Username = username;
		Password = password;
		Usertype = usertype;
		this.city = city;
	}
	/*
	 * return city
	 */
	public String getCity() {
		return city;
	}

	/*
	 * Assign city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer NIC = " + NIC + "\n" + "Customer Name = " + Name + "\n" + "Phone number = " + Phone + "\n"
				+ "E-mail = " + email + "\n" + "Username = " + Username + "\n" + "Password = "
				+ Password + "\n" + "Usertype = " + Usertype + "\n" + "City = " + city + "\n";
	}

}
