package com.mycompany.app;

import com.google.inject.Inject;

public class TextEditorCustomAnnotated {

    private SpellChecker spellingChecker;

    @Inject
    public TextEditorCustomAnnotated(@WinWord SpellChecker spellingChecker) {
	super();
	this.spellingChecker = spellingChecker;
    }

    public void performSpellCheck() {
	System.out.println(">>>> Custome annotated binding");
	spellingChecker.checkSpelling();
    }

}
