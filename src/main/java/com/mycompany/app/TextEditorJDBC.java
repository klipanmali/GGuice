package com.mycompany.app;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class TextEditorJDBC {
    private String dbUrl;

    @Inject
    public TextEditorJDBC(@Named("JDBC") String dbUrl) {
	this.dbUrl = dbUrl;
    }

    public void makeConection() {
	System.out.println("connectin DB to: " + dbUrl);

    }

}
