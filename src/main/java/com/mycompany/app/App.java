package com.mycompany.app;

import com.google.inject.Guice;
import com.google.inject.Injector;

import junit.framework.Assert;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Guice DI");
		Injector injector = Guice.createInjector(new TextEditorModule());

		TextEditor textEditor = injector.getInstance(TextEditor.class);
		textEditor.performSpellCheck();
		// Custom Annotated Binding
		TextEditorCustomAnnotated annotatedTextEditor = injector.getInstance(TextEditorCustomAnnotated.class);
		annotatedTextEditor.performSpellCheck();
		// @Named Annotated Binding
		TextEditorNamedAnnotated oOTextEditor = injector.getInstance(TextEditorNamedAnnotated.class);
		oOTextEditor.performSpellCheck();
		// Constants binding, ,bind to instance
		TextEditorJDBC jdbcTextEditor = injector.getInstance(TextEditorJDBC.class);
		jdbcTextEditor.makeConection();
		// creating complex objects using @Provides method
		TextEditorComplex complexTextEditor = injector.getInstance(TextEditorComplex.class);
		complexTextEditor.makeSpellCheck();
		// creating complex objects using Provider class
		TextEditorComplex2 complexTextEditor2 = injector.getInstance(TextEditorComplex2.class);
		complexTextEditor2.makeSpellCheck();
		// Create bindings with specific constructor of an object
		TextEditorConstructor constructorTextEditor = injector.getInstance(TextEditorConstructor.class);
		constructorTextEditor.makeSpellCheck();
		// Inbuilt Bindings, Logger is automatically bind to
		// java.util.logging.Logger class
		// No extra binding in Module is neccesaary
		TextEditorLogger loggerTxtEditor = injector.getInstance(TextEditorLogger.class);
		loggerTxtEditor.makeSpellCheck();
		// Method Injection
		TextEditorMethod methodTextEditor = injector.getInstance(TextEditorMethod.class);
		methodTextEditor.makeSpellCheck();
		// Field injection
		TextEditorField methodTextField = injector.getInstance(TextEditorField.class);
		methodTextField.makeSpellCheck();
		// Optional injection
		TextEditorOptionalInjection optionalInjrctionTextEditor = injector
				.getInstance(TextEditorOptionalInjection.class);
		optionalInjrctionTextEditor.makeSpellCheck();
		// On demand Injection
		// in this case this needs to be done first
		SpellCheckerOnDemandInjection onDemandChecker = new SpellCheckerOnDemandInjection();
		injector.injectMembers(onDemandChecker);
		TextEditorOnDemandInjection onDemandInjectTextEditor = injector.getInstance(TextEditorOnDemandInjection.class);
		onDemandInjectTextEditor.makeSpellCheck();
		// Guice Injection, Singleton scope
		TextEditorScoped singletonScopeTextEditor = injector.getInstance(TextEditorScoped.class);
		singletonScopeTextEditor.makeSpellCheck();
		TextEditorScoped anotherSingletonScopeTextEditor = injector.getInstance(TextEditorScoped.class);
		anotherSingletonScopeTextEditor.makeSpellCheck();
		// Injecting Providers
		BillingService billingService = injector.getInstance(RealBillingService.class);
		billingService.chargeOrder("Fungi pizza", "3653653654");
		// Injecting custome Proiders
		MyClassUser myClassUser = injector.getInstance(MyClassUser.class);
		Assert.assertTrue(myClassUser.get().myProvider);
		// Guice AOP
		TextEditorAOP aopTextEditor = injector.getInstance(TextEditorAOP.class);
		aopTextEditor.makeSpellCheck();

	}
}
