package com.mycompany.app.closabelresources;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ResourceProvider {

	public OutputStreamWriter provideOutputStream() throws IOException {
		return new FileWriter("./outfile.txt", true);
	}
}
