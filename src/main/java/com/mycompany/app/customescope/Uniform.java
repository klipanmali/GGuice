package com.mycompany.app.customescope;

public class Uniform {

	private ClassColor color;

	public Uniform() {
		this.color = ClassColor.getRandomColor();
	}

	public Uniform(ClassColor color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Uniform is " + color;
	}

}
