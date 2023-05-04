package com.oop.model;

public class ShowOrder {
	
	private int id;
	private String product;
	private int size;
	private int qty;
	private String name;
	private String email;
	public int getId() {
		return id;
	}
	public String getProduct() {
		return product;
	}
	public int getSize() {
		return size;
	}
	public int getQty() {
		return qty;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
