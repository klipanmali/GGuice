package com.mycompany.app;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

public class TextEditorModule extends AbstractModule {

    /*
     * (non-Javadoc)
     * 
     * @see com.google.inject.AbstractModule#configure()
     */
    @Override
    protected void configure() {
	// this is linked binding
	bind(SpellChecker.class).to(SpellCheckerImpl.class);
	// linked binding too
	bind(SpellCheckerImpl.class).to(WinWordSpellCheckerImpl.class);
	// custom annotated binding
	bind(SpellChecker.class).annotatedWith(WinWord.class).to(WinWordSpellCheckerImpl.class);
	// @Named annotated binding
	bind(SpellChecker.class).annotatedWith(Names.named("OpenOffice")).to(OpenOfficeWordSpellCheckerImpl.class);
	// Constants binding, bind to instance
	bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc:mysql://localhost:5326/emp");
	// binding to Provider class
	bind(SpellCheckerComplex2.class).toProvider(SpellCheckerComplex2Provider.class);

    }

    // if binding object is a little bit complex
    @Provides
    public SpellCheckerComplex provideSpellCheckerComoplex() {
	String dbUrl = "jdbc:mysql://localhost:53261/emp";
	String user = "user";
	int timeout = 10000;
	return new SpellCheckerComplex(dbUrl, user, timeout);
    }

}
