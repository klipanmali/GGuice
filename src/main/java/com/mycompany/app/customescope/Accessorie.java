package com.mycompany.app.customescope;

public class Accessorie {

	private ClassColor color;

	public Accessorie() {
		this.color = ClassColor.getRandomColor();
	}

	public Accessorie(ClassColor color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Accessorie is " + color;
	}

}
