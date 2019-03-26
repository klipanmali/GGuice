package com.mycompany.app.cyclicdependency;

import java.util.NoSuchElementException;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class Clerk {

	// private final Store store;
	private final Provider<Store> storeProvider;

	// This is bad, cyclic dependency, Store(Boss(Clerk(Store...)))
	// @Inject
	// public Clerk(Store store) {
	// this.store = store;
	// }

	// Better solution, injecting provider
	@Inject
	public Clerk(Provider<Store> provider) {
		System.out.println("Creating Clerk");
		storeProvider = provider;
	}

	public void doSale() {
		System.out.println("Fetching Store");
		Store store = storeProvider.get();
		while (true) {
			try {
				Customer customer = store.getNextCustomer();
				System.out.println("Sold to: " + customer.getName());
			} catch (NoSuchElementException e) {
				System.out.println("No more customers");
				break;
			}
		}
	}
}
