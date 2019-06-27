package com.study.jws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(name = "HelloWorldService", targetNamespace = "http://www.study.com/hello")
@SOAPBinding(style = Style.RPC)
public interface IHelloWorldService {

	/**
	 * Test WebService
	 * 
	 * @param name username
	 * @return greet hello username
	 */
	@WebMethod(operationName = "hello")
	public @WebResult(name = "result") String hello(@WebParam(name = "name") String name);
}
