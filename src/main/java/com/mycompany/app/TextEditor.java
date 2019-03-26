package com.mycompany.app;

import com.google.inject.Inject;

public class TextEditor {
    private SpellChecker spellingChecker;

    @Inject
    public TextEditor(SpellChecker spellingChecker) {
	super();
	this.spellingChecker = spellingChecker;
    }

    public void performSpellCheck() {
	spellingChecker.checkSpelling();
    }

}
