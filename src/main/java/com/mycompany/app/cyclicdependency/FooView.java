package com.mycompany.app.cyclicdependency;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

public class FooView {
	private FooPresenter fooPresenter;

	// This leads to cyclic dependency
	// @Inject
	// public FooView(FooPresenter presenter) {};
	@Inject
	public FooView(@Assisted FooPresenter presenter) {
		this.fooPresenter = presenter;
	}

	public void userDidSomething() {
		System.out.println("View, user did something");
		fooPresenter.somethingWasDone();
	}

	public void doSomething() {
		System.out.println("View, Acknowledge User what it did was OK");
	}

	// This is factory method that will be used by Factory, dynamically created by
	// Guice, to create FooView instance
	public static interface ViewFactory {
		FooView create(FooPresenter presenter);
	}

}
