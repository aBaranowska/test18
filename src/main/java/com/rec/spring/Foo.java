package com.rec.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Foo {

	private Service service;

	@Autowired
	public void setMyService(Service service) {
		this.service = service;
	}

	public String getMessage() {
		return service.getMessage();
	}

}
