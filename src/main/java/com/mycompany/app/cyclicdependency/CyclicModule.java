package com.mycompany.app.cyclicdependency;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class CyclicModule extends AbstractModule {

	@Override
	protected void configure() {
		super.configure(); // ???
		// Store must be bound as Singleton, otherwise provider will return new Store
		// instance, new boss and new Clerk
		bind(Store.class).in(Singleton.class);
	}

}
