package com.mycompany.app.privatemodules;

import com.google.inject.Inject;

public class Leg {
	@Inject
	Foot foot;

	@Override
	public String toString() {
		return "leg(" + foot + ")";
	}
}
