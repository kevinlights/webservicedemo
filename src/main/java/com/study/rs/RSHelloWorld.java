package com.study.rs;

public class RSHelloWorld implements IRSHelloWorld {

	@Override
	public String sayhello(String name) {
		return "Hello " + name;
	}

	@Override
	public String saybye(String name) {
		return "Bye " + name;
	}

}
