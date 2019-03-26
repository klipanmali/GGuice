package com.mycompany.app.multibindings;

import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// This is the "Plugin" that implements UriSulmmaraizer interface
public class FlickrPhotoSummarizer implements UriSummarizer {

	private static final Pattern PHOTO_PATTERN = Pattern.compile("http://www\\.flickr\\.com/photos/[^/]+/(\\d+)/");

	@Override
	public String summarize(URI uri) {
		Matcher matcher = PHOTO_PATTERN.matcher(uri.toString());
		if (!matcher.matches()) {
			return null;
		} else {
			String id = matcher.group(1);
			return id;
		}
	}

}
