package com.mycompany.app;

import java.util.Random;

import com.google.inject.Singleton;

@Singleton
public class SpellCheckerScope implements SpellChecker {

	private Integer randNumber;
	public SpellCheckerScope() {
		Random rnd = new Random();
		randNumber = rnd.nextInt();
	}
	
	@Override
	public void checkSpelling() {
		System.out.println("Spelling checker, singleton scoped");
		System.out.println("Random number = " + randNumber);

	}

}
