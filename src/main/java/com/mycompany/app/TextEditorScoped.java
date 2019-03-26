package com.mycompany.app;

import java.util.Random;

import com.google.inject.Inject;

public class TextEditorScoped {

    private SpellChecker spellChecker;
    private Integer randomInt;
    @Inject
    public TextEditorScoped(SpellCheckerScope spellChecker) {
	this.spellChecker = spellChecker;
	Random rnd = new Random();
	randomInt = rnd.nextInt();
    }
    
    public TextEditorScoped() {
    	
    }

    public void makeSpellCheck() {
	System.out.println(">>>> Guice Injection, Singleton scope");
	System.out.println("TextEditor random integer value = "+randomInt);
	spellChecker.checkSpelling();
    }

}
