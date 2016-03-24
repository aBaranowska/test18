package com.rec.spring;

import org.springframework.stereotype.Component;

@Component
public class ExampleService implements Service {

	public String getMessage() {
		return "Hello world!";
	}

}
