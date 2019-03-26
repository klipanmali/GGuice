package com.mycompany.app.cyclicdependency;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class StoreApp {

	public static void main(String[] args) {
		System.out.println("Store App");
		Injector injectore = Guice.createInjector(new CyclicModule());
		Store store = injectore.getInstance(Store.class);
		store.incomingCustomer(new Customer("Ivica"));
		store.incomingCustomer(new Customer("Marica"));
		Clerk clerk = store.getBoss().getClerk();
		clerk.doSale();
	}

}
