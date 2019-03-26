package com.mycompany.app;

import com.google.inject.Inject;

public class TextEditorComplex {
    private SpellChecker spellChecker;

    @Inject
    public TextEditorComplex(SpellCheckerComplex spellChecker) {
	this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
	System.out.println(">>>> Creating complex objects using @Provides method");
	spellChecker.checkSpelling();
    }

}
