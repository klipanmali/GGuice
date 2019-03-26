package com.mycompany.app.customescope;

import com.google.inject.Inject;

public class Pupil {

	private Uniform uniform;
	private Accessorie accessorie;
	private Integer myNumber;
	private static Integer pupilCounter = 0;

	@Inject
	public Pupil(Uniform uniform, Accessorie accessorie) {
		this.uniform = uniform;
		this.accessorie = accessorie;
		myNumber = ++pupilCounter;
	}

	@Override
	public String toString() {
		return "Pupil " + myNumber + ":\n   " + uniform + "\n   " + accessorie + "\n";
	}

}
