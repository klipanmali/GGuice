package com.mycompany.app.closabelresources;

import java.io.File;
import java.nio.charset.StandardCharsets;

import com.google.common.io.CharSink;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class MyModuleOK extends AbstractModule {

	@Provides
	CharSink providesCharSink() {
		return Files.asCharSink(new File("./outfile.txt"), StandardCharsets.UTF_8, FileWriteMode.APPEND);
	}
}
