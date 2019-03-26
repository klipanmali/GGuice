package com.mycompany.app.closabelresources;

import java.io.FileWriter;
import java.io.IOException;

import com.google.inject.Inject;

public class ClientNotOK {

	private final FileWriter fileWriter;

	@Inject
	public ClientNotOK(FileWriter fos) {
		this.fileWriter = fos;
	}

	public void printSomething() throws IOException {
		System.out.println("CLientNotOK Writting to file");
		fileWriter.write("Hello from CLientNotOK\n");
		fileWriter.flush();
	}

	public void close() throws IOException {
		System.out.println("ClientNotOK Closing file");
		fileWriter.close();
	}

}
