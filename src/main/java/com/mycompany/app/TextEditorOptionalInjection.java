package com.mycompany.app;

import com.google.inject.Inject;

public class TextEditorOptionalInjection {

    private SpellChecker spellChecker;

    @Inject
    public TextEditorOptionalInjection(SpellCheckerOptinalInjection spellChecker) {
	this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
	System.out.println(">>>> Optional injection");
	spellChecker.checkSpelling();
    }

}
