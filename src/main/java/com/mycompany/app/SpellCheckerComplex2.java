package com.mycompany.app;

import com.google.inject.Inject;

public class SpellCheckerComplex2 extends SpellCheckerComplex {

    @Inject // do I need this annotation here ???
	    // in my case not really, since *Provider class provides instance of
	    // this class
    public SpellCheckerComplex2(String dbUrl, String user, int timeout) {
	super(dbUrl, user, timeout);
    }

}
