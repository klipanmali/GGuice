package com.mycompany.app;

import com.google.inject.Inject;

public class SpellCheckerComplex implements SpellChecker {

    private String dbUrl;
    private String user;
    private int timeout;

    @Inject
    public SpellCheckerComplex(String dbUrl, String user, int timeout) {
	this.dbUrl = dbUrl;
	this.user = user;
	this.timeout = timeout;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mycompany.app.SpellChecker#checkSpelling()
     */
    public void checkSpelling() {
	System.out.println("Complex Spelling checker");
	System.out.println("DB Url: " + dbUrl);
	System.out.println("User: " + user);
	System.out.println("Timeout: " + timeout);
    }

}
