package com.mycompany.app.customescope;

import java.util.HashSet;
import java.util.Set;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class School {

	private Set<Pupil> pupilClass = new HashSet<>();

	@Override
	public String toString() {
		String newClass = "Welcome class\n";
		for (Pupil pupil : pupilClass) {
			newClass += pupil;
		}
		return newClass;
	}

	public void addPupil(Pupil pupil) {
		System.out.println("" + System.currentTimeMillis() + ": adding Pupil");
		pupilClass.add(pupil);
	}

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new MyModule());
		School school = injector.getInstance(School.class);

		for (int i = 0; i < 10; i++) {
			school.addPupil(injector.getInstance(Pupil.class));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(school);
	}

}
