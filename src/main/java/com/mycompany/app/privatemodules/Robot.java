package com.mycompany.app.privatemodules;

import com.google.inject.Inject;

public class Robot {
	@Inject
	@Left
	Leg leftLeg;
	@Inject
	@Right
	Leg rightLeg;

	@Override
	public String toString() {
		return "ROBOT\n " + leftLeg + "\n " + rightLeg + "\n";
	}
}
