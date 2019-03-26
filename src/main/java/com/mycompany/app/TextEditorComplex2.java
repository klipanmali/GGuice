package com.mycompany.app;

import com.google.inject.Inject;

public class TextEditorComplex2 {

    private SpellChecker spellChecker;

    @Inject
    public TextEditorComplex2(SpellCheckerComplex2 spellChecker) {
	this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
	System.out.println(">>>> Creating complex objects using Provider class");
	spellChecker.checkSpelling();
    }

}
