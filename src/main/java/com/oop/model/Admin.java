package com.oop.model;

/**
 * This is the Admin model class
 */
public class Admin extends User{
	/*
	 * Declaring class variable
	 */
	private String bday;
	
	/*
	 * constructor for admin
	 */
	public Admin(String nIC, String name, String phone, String email, String username, String password,
			String usertype, String bday) {
		NIC = nIC;
		Name = name;
		Phone = phone;
		this.email = email;
		Username = username;
		Password = password;
		Usertype = usertype;
		this.bday = bday;
	}
	/*
	 * return bday
	 */
	public String getBday() {
		return bday;
	}

	/*
	 * Assign bday
	 */
	public void setBday(String bday) {
		this.bday = bday;
	}

	@Override
	public String toString() {
		return "Admin NIC = " + NIC + "\n" + "Admin Name = " + Name + "\n" + "Phone number = " + Phone + "\n"
				+ "E-mail = " + email + "\n" + "Username = " + Username + "\n" + "Password = "
				+ Password + "\n" + "Usertype = " + Usertype + "\n" + "Birth day = " + bday;
	}	
}
