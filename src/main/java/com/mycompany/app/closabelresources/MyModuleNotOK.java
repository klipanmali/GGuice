package com.mycompany.app.closabelresources;

import java.io.FileWriter;
import java.io.IOException;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class MyModuleNotOK extends AbstractModule {

	@Provides
	FileWriter provideFileStream() {
		try {
			return new FileWriter("./outfile.txt", true);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
