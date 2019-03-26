package com.mycompany.app;

import com.google.inject.Inject;

public class SpellCheckerComplex2 extends SpellCheckerComplex {

    @Inject
    public SpellCheckerComplex2(String dbUrl, String user, int timeout) {
	super(dbUrl, user, timeout);
    }

}
