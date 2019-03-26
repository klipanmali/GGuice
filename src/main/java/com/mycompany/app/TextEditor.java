package com.mycompany.app;

import com.google.inject.Inject;

public class TextEditor {
    private SpellChecker spellingChecker;
    private Printer printer;
    private LetterTransformer letterTransformer;

    @Inject
    public TextEditor(SpellChecker spellingChecker, Printer printer, LetterTransformer transformer) {
	super();
	this.spellingChecker = spellingChecker;
	this.printer = printer;
	this.letterTransformer = transformer;
    }

    public void performSpellCheck() {
	System.out.println(">>>> Linked binding, @ImplementedBy, @ProvidedBy");
	spellingChecker.checkSpelling();
	String toPrint = "Text to print";
	printer.print(toPrint);
	String transformed = letterTransformer.transfor(toPrint);
	printer.print(transformed);

    }

}
