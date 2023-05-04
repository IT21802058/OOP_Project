package com.oop.service;

public class FuelStorageImpl implements iFuelStorage{
	String fType;
	int liters;
	public String getfType() {
		return fType;
	}
	public void setfType(String fType) {
		this.fType = fType;
	}
	public int getLiters() {
		return liters;
	}
	public void setLiters(int liters) {
		this.liters = liters;
	}
}
