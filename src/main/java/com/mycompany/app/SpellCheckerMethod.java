package com.mycompany.app;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SpellCheckerMethod implements SpellChecker {

    private String dbUrl;

    public SpellCheckerMethod() {
	System.out.println("SpellCheckerMethod constructed");
    }

    @Inject
    public void serDbUrl(@Named("JDBC") String dbUrl) {
	System.out.println("dbUrl injected");
	this.dbUrl = dbUrl;
    }

    @Override
    public void checkSpelling() {
	System.out.println("Spelling checker Method injected");
	System.out.println("DB Url: " + dbUrl);
    }

}
