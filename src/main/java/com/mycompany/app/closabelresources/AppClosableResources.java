package com.mycompany.app.closabelresources;

import java.io.IOException;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class AppClosableResources {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new MyModuleNotOK(), new MyModuleOK());
		ClientNotOK clientNotOK = injector.getInstance(ClientNotOK.class);
		ClientOK clientOK = injector.getInstance(ClientOK.class);
		ClientOK clientOKdrugi = injector.getInstance(ClientOK.class);
		ClientOK2 clientOK2 = injector.getInstance(ClientOK2.class);

		try {
			clientNotOK.printSomething();
			clientNotOK.printSomething();
			// in case of multiple clients who is responsible for closing closable object
			clientNotOK.close();

			// Solution is to not inject closable resources, but instead, objects that can
			// expose short-lived closable resources that are used as necessary.
			// now there should be no problem with multiple clients accessing the same file
			// and who needs to close the file
			clientOK.printSomething();
			clientOKdrugi.printSomething();

			// or to use AutoClosable resource
			clientOK2.printSomething();

		} catch (IOException e) {
			System.out.println("Shit happened");
			e.printStackTrace();
		}
	}

}
