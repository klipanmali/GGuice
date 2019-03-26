package com.mycompany.app.customescope;

import com.google.inject.Inject;

public class Uniform {

	private ClassColor color;

	@Inject
	public Uniform(String color) {
		super();
		this.color = ClassColor.getColor();
	}

	@Override
	public String toString() {
		return "Uniform is " + color;
	}

}
