package com.mycompany.app;

public class SpellCheckerAOP implements SpellChecker {

	@Override @CallTracker
	public void checkSpelling() {
		System.out.println("Spelling checker, AOP");
	}

}
