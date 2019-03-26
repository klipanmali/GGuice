package com.mycompany.app;

import com.google.inject.Inject;

public class TextEditor {
    private SpellChecker spellingChecker;
    private Printer printer;

    @Inject
    public TextEditor(SpellChecker spellingChecker, Printer printer) {
	super();
	this.spellingChecker = spellingChecker;
	this.printer = printer;
    }

    public void performSpellCheck() {
	System.out.println(">>>> Linked binding and @ImplementedBy annotation");
	spellingChecker.checkSpelling();
	printer.print("Text to print");
    }

}
