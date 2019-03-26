package com.mycompany.app;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class TextEditorNamedAnnotated {

    private SpellChecker spellingChecker;

    @Inject
    public TextEditorNamedAnnotated(@Named("OpenOffice") SpellChecker spellingChecker) {
	super();
	this.spellingChecker = spellingChecker;
    }

    public void performSpellCheck() {
	spellingChecker.checkSpelling();
    }

}
