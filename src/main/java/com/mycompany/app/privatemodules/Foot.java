package com.mycompany.app.privatemodules;

public class Foot {
	private final String name;

	public Foot(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "foot(" + name + ")";
	}

}
