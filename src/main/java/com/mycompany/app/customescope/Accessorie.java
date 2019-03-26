package com.mycompany.app.customescope;

import com.google.inject.Inject;

public class Accessorie {

	private ClassColor color;

	@Inject
	public Accessorie(String color) {
		this.color = ClassColor.getColor();
	}

	@Override
	public String toString() {
		return "Accessorie is " + color;
	}

}
