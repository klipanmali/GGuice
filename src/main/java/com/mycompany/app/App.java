package com.mycompany.app;

import com.google.inject.Guice;
import com.google.inject.Injector;

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

    }
}
