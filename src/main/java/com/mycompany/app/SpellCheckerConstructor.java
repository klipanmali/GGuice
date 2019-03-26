package com.mycompany.app;

import com.google.inject.name.Named;

public class SpellCheckerConstructor implements SpellChecker {

    private String dbUrl;

    //this one doesn't have @Inject, because binding is done expicitelly to this constructor
    public SpellCheckerConstructor(@Named("JDBCcons") String dbUrl) {
	this.dbUrl = dbUrl;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.mycompany.app.SpellChecker#checkSpelling()
     */
    public void checkSpelling() {
	System.out.println("Constructor Spelling checker");
	System.out.println("DB Url: " + dbUrl);

    }

}
