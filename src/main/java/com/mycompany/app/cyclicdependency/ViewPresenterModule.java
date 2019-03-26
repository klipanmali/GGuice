package com.mycompany.app.cyclicdependency;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class ViewPresenterModule extends AbstractModule {

	@Override
	protected void configure() {

		install(new FactoryModuleBuilder().build(FooView.ViewFactory.class));
		// It can be done this way too, but this is used when FooView implements some
		// View interface (.implement(View.class,FooView.class)
		// install(new FactoryModuleBuilder().implement(FooView.class,
		// FooView.class).build(FooView.ViewFactory.class));

	}

}
