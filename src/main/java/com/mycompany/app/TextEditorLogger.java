package com.mycompany.app;

import java.util.logging.Logger;

import com.google.inject.Inject;

/**
 * Guice provides inbuilt binding for java.util.logging.Logger class. Logger's
 * name is automatically set to the name of the class into which the Logger is
 * injected.
 */
public class TextEditorLogger {
    Logger logger;

    @Inject
    public TextEditorLogger(Logger logger) {
	this.logger = logger;
    }

    public void makeSpellCheck() {
	logger.info("In TextEditorLogger.makeSpellCeck() method");
    }

}
