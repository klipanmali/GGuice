package com.mycompany.app;

public class SpellCheckerOnDemandInjection implements SpellChecker {

	@Override
	public void checkSpelling() {
		System.out.println("Spelling checker, on demand injection");
	}

}
