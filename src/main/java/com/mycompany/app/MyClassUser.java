package com.mycompany.app;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

class MyClassUser {

	Provider<MyClass> provider;

	@Inject
	MyClassUser(@Named("CustomeProvider") Provider<MyClass> provider) {
		System.out.println(">>>> Injecting Custome Provider");
		System.out.println("MyClassUser created");
		this.provider = provider;
	}

	MyClass get() {
		System.out.println("Getting MyClass from Custome Provider");
		return provider.get();
	}

}

class MyClass {

	MyClass() {
		System.out.println("MyClass created");
		myProvider = true;
	}

	Boolean myProvider = false;
}

class MyClassCustomeProvider implements Provider<MyClass> {

	Provider<MyClass> provider;

	// Default Provider<MyClasss> will be injected here
	@Inject
	MyClassCustomeProvider(Provider<MyClass> provider) {
		System.out.println("MyClassCustomeProvider created");
		this.provider = provider;
	}

	@Override
	public MyClass get() {
		System.out.println("Getting MyClass from Default Proivder");
		return provider.get();
	}

}