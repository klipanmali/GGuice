package com.mycompany.app;

import com.google.inject.Inject;

public class TextEditorOnDemandInjection {

    private SpellChecker spellChecker;

    @Inject
    public TextEditorOnDemandInjection(SpellCheckerOnDemandInjection spellChecker) {
	this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
	System.out.println(">>>> On demand injection");
	spellChecker.checkSpelling();
    }

}
