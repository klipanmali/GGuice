package com.mycompany.app.customescope;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class School {

	private List<Pupil> pupilClass = new ArrayList<>();

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
		ScopeControler scopeControler = injector.getInstance(ScopeControler.class);
		new Thread(scopeControler).start();

		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(18000);
				school.addPupil(injector.getInstance(Pupil.class));
			}
		} catch (InterruptedException e) {
			System.out.println("Maint thread interrupted");
			e.printStackTrace();
		}

		System.out.println(school);
	}

}
