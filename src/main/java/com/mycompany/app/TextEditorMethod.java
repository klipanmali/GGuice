package com.mycompany.app;

import com.google.inject.Inject;

public class TextEditorMethod {

    private SpellChecker spellChecker;

    @Inject
    public TextEditorMethod(SpellCheckerMethod spellChecker) {
	this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
	System.out.println(">>>> Method injection");
	spellChecker.checkSpelling();
    }

}
