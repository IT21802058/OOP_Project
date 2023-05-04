package com.oop.model;

public class Fuel {
	private String fType;
	private int liter;
	
	public Fuel(String fType, int liter) {
		this.fType = fType;
		this.liter = liter;
	}
	public String getfType() {
		return fType;
	}

	public int getLiter() {
		return liter;
	}
	
}
