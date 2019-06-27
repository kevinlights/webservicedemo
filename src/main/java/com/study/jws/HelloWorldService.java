package com.study.jws;

//import javax.jws.WebService;

//@WebService(targetNamespace = "http://www.study.com/hello")
public class HelloWorldService implements IHelloWorldService {

	@Override
	public String hello(String name) {
		return "Hello " + name;
	}

}
