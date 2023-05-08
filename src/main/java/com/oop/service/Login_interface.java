package com.oop.service;

public interface Login_interface {
	
	public int validate(String mail, String pwd, String type);
	
	public String getNIC(String email);
}
