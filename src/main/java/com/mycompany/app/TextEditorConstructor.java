package com.mycompany.app;

import com.google.inject.Inject;

public class TextEditorConstructor {

    private SpellChecker spellChecker;

    @Inject
    public TextEditorConstructor(SpellCheckerConstructor spellChecker) {
	this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
	System.out.println(">>>> Create bindings with specific constructor of an object");
	spellChecker.checkSpelling();
    }

}
