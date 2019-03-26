package com.mycompany.app.multibindings;

import java.net.URI;
import java.net.URISyntaxException;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new FlickrPluginModule());
		// other modules can be added
		// Injector injector = Guice.createInjector(new FlickrPluginModule(),new ...);

		TweetPrettifier prettifier = injector.getInstance(TweetPrettifier.class);

		try {
			System.out
					.println("Result: " + prettifier.prettifyTweet(new URI("http://www.flickr.com/photos/ggg/56789/")));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
