package com.mycompany.app.multibindings;

import java.net.URI;

// this is the interface provided by the application,
// plugins provide implementation and need to register to the application
public interface UriSummarizer {

	String summarize(URI uri);
}
