package com.mycompany.app;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SpellCheckerOptinalInjection implements SpellChecker {

	// in optional injection, attributes must have some default value
    private String dbUrl = "default url";
    @Inject(optional = true) @Named("un")
    private String user = "default user";
    @Inject(optional = true) @Named("to")
    private Integer timeout  = 1000;

    // this is not necessary, empty constructor is used is
    // no other constructor is @Injection annotated
    public SpellCheckerOptinalInjection() {
    	
    }
    
    @Inject(optional = true)
    public void setDbUrl(@Named("JDBCd") String dbUrl) {
    	this.dbUrl = dbUrl;
    }
    
    //@Injection is valid for several method parameters too
    public void set(@Named("JDBCd") String dbUrl, @Named("un") String user) {
    	this.dbUrl = dbUrl;
    	this.user = user;
    }
    
	@Override
	public void checkSpelling() {
		System.out.println("Spelling checker, optinonal injection");
		System.out.println("DB Url: " + dbUrl);
		System.out.println("User: " + user);
		System.out.println("Timeout: " + timeout);
	}

}
