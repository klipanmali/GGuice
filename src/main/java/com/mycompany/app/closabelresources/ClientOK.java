package com.mycompany.app.closabelresources;

import java.io.IOException;

import com.google.common.io.CharSink;
import com.google.inject.Inject;

public class ClientOK {

	private final CharSink charSink;

	@Inject
	public ClientOK(CharSink charSink) {
		this.charSink = charSink;
	}

	public void printSomething() throws IOException {
		System.out.println("ClientOK writting something");
		charSink.write("Hello from ClientOK\n");// Opens the file at this point, and closes once its done
	}

}
