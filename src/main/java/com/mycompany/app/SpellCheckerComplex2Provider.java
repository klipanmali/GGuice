package com.mycompany.app;

import com.google.inject.Provider;

/**
 * As @Provides method becomes more complex, these methods can be moved to a
 * separate classes using Provider interface
 *
 */
public class SpellCheckerComplex2Provider implements Provider<SpellCheckerComplex2> {

    public SpellCheckerComplex2 get() {
	String dbUrl = "jdbc:mysql://localhost:53262/emp";
	String user = "admin";
	Integer timeout = 100;
	return new SpellCheckerComplex2(dbUrl, user, timeout);
    }

}
