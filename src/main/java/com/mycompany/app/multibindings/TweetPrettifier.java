package com.mycompany.app.multibindings;

import java.net.URI;
import java.util.Set;

import com.google.inject.Inject;

public class TweetPrettifier {
	private final Set<UriSummarizer> summarizers;

	@Inject
	// and here there are, multibindings
	public TweetPrettifier(Set<UriSummarizer> summarizers) {
		this.summarizers = summarizers;
	}

	public String prettifyTweet(URI uri) {
		for (UriSummarizer summarizer : summarizers) {
			String summary = summarizer.summarize(uri);
			if (summary != null) {
				return summary;
			}
		}
		// no summary found
		return uri.toString();
	}
}
