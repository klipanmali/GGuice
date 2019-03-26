package com.mycompany.app.customescope;

import java.util.Random;

public enum ClassColor {

	RED("Red"), BLUE("Blue"), GREEN("Green"), YELLOW("Yellow");

	private String color;

	ClassColor(String color) {
		this.color = color;
	}

	public static ClassColor getColor() {
		Random rnd = new Random();
		int color = rnd.nextInt(4);
		switch (color) {
		case 0:
			return RED;
		case 1:
			return BLUE;
		case 2:
			return GREEN;
		default:
			return YELLOW;
		}
	}

	@Override
	public String toString() {
		return color;
	}

}
