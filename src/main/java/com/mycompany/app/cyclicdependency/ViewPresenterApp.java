package com.mycompany.app.cyclicdependency;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ViewPresenterApp {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new ViewPresenterModule());
		FooPresenter presenter = injector.getInstance(FooPresenter.class);
		presenter.somethingWasDone();

	}

}
