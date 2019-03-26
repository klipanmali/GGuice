package com.mycompany.app.closabelresources;

import java.io.IOException;
import java.io.OutputStreamWriter;

import com.google.inject.Inject;

public class ClientOK2 {

	private final ResourceProvider provider;

	@Inject
	public ClientOK2(ResourceProvider provider) {
		this.provider = provider;
	}

	public void printSomething() throws IOException {
		try (OutputStreamWriter writer = provider.provideOutputStream()) {
			System.out.println("ClientOk2 writting ot file");
			writer.write("Hello from ClientOK2");
		}
	}

}
