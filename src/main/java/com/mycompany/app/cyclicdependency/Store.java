package com.mycompany.app.cyclicdependency;

import java.util.LinkedList;
import java.util.NoSuchElementException;

import com.google.inject.Inject;

public class Store {
	private LinkedList<Customer> customers;
	private Boss boss;

	@Inject
	public Store(Boss boss) {
		System.out.println("Creating Store");
		this.boss = boss;
		customers = new LinkedList<>();
	}

	public Boss getBoss() {
		return boss;
	}

	public void incomingCustomer(Customer customer) {
		customers.add(customer);
	}

	public Customer getNextCustomer() throws NoSuchElementException {
		return customers.removeFirst();
	}
}
