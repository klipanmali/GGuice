package com.mycompany.app;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.matcher.Matchers;
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
		bind(SpellCheckerImpl.class).to(SpellCheckerWinWord.class);
		// custom annotated binding
		bind(SpellChecker.class).annotatedWith(WinWord.class).to(SpellCheckerWinWord.class);
		// @Named annotated binding
		bind(SpellChecker.class).annotatedWith(Names.named("OpenOffice")).to(SpellCheckerOpenOfficeWord.class);
		// Constants binding, bind to instance
		bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc:mysql://localhost:5326/emp");
		// bind to instance, this is possible too
		// You should limit the use of this mode where there isn’t any heavy
		// initialization or dependency injection necessary.
		// bind(SpellChecker.class).toInstance(new SpellCheckerWinWord());
		// binding to Provider class
		bind(SpellCheckerComplex2.class).toProvider(SpellCheckerComplex2Provider.class);
		// binding to the constructor
		try {
			bind(SpellCheckerConstructor.class)
					.toConstructor(SpellCheckerConstructor.class.getConstructor(String.class));
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println("Required constructor missing");
		}
		// Constants binding, bind to instance
		bind(String.class).annotatedWith(Names.named("JDBCcons")).toInstance("jdbc:mysql://localhost:53266/emp");
		bind(String.class).annotatedWith(Names.named("un")).toInstance("PajoPatak");
		// @ImplementedBy annotation, No binding is required in Binding Module
		// @ProvidedBy annotation, similar to Provider class, but doesn't
		// require binding
		// On demand Injection, also doesn't require extra binding
		// Guice AOP
		// need two matchers: one to define which classes participate, and another for
		// the methods of those classes
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(CallTracker.class), new CallTrackingService());
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
