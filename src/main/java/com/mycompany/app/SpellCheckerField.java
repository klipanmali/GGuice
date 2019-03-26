package com.mycompany.app;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SpellCheckerField implements SpellChecker {

	@Inject @Named("un")
	private String username;
	
	public SpellCheckerField() {
		
	}
	
	@Override
	public void checkSpelling() {
		System.out.println("Spelling checker Filed injected");
		System.out.println("User Name: " + username);
	}

}
