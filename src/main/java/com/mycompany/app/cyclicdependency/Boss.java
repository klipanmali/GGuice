package com.mycompany.app.cyclicdependency;

import com.google.inject.Inject;

public class Boss {
	private Clerk clerk;

	@Inject
	public Boss(Clerk clerk) {
		System.out.println("Creating Boss");
		this.clerk = clerk;
	}

	public Clerk getClerk() {
		return clerk;
	}
}
