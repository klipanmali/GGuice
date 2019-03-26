package com.mycompany.app;

import com.google.inject.Inject;

public class TextEditorField {
    private SpellChecker spellChecker;

    @Inject
    public TextEditorField(SpellCheckerField spellChecker) {
	this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
	System.out.println(">>>> Field injection");
	spellChecker.checkSpelling();
    }

}
