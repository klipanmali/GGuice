package com.mycompany.app.privatemodules;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class RobotApp {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new LegModule<Left>(Left.class) {
			@Override
			void bindFoot() {
				bind(Foot.class).toInstance(new Foot("leftie"));
			}
		}, new LegModule<Right>(Right.class) {
			@Override
			void bindFoot() {
				bind(Foot.class).toInstance(new Foot("righty"));
			}
		});

		System.out.println(injector.getInstance(Robot.class));
	}

}
