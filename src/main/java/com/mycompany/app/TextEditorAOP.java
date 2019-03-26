package com.mycompany.app;

import com.google.inject.Inject;

public class TextEditorAOP {
    private SpellChecker spellChecker;

    @Inject
    public TextEditorAOP(SpellCheckerAOP spellChecker) {
	this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
	System.out.println(">>>> Guice AOP");
	spellChecker.checkSpelling();
    }

}
