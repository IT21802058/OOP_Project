package com.oop.service;

import java.util.ArrayList;
import java.util.List;

import com.oop.model.Fuel_order;

public interface ifuelorder {
	int ArrayList = 0;

	public void addFuelOrder(Fuel_order order);

	public boolean checkIdExist(String parameter);

	public List<Fuel_order> getAllFuelOrders();

	public ArrayList<Fuel_order> getShowOrder();
}
