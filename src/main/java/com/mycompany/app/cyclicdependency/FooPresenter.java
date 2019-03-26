package com.mycompany.app.cyclicdependency;

import com.google.inject.Inject;

public class FooPresenter {

	private FooView fooView;

	@Inject
	public FooPresenter(FooView.ViewFactory veiwFactory) {
		this.fooView = veiwFactory.create(this);
	}

	public void somethingWasDone() {
		System.out.println("Presenter got notified by the view that user did something");
		fooView.doSomething();
	}

}
