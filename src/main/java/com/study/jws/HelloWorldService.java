package com.study.jws;

import javax.jws.WebService;

import com.study.vo.UserVO;

// 实现类上需要添加此注解，这样在页面上显示出来的才是指定的namespace,否则会按包名来展示
@WebService(targetNamespace = "http://www.study.com/hello")
public class HelloWorldService implements IHelloWorldService {

	@Override
	public String hello(String name) {
		return "Hello " + name;
	}

	@Override
	public UserVO getUser(Integer id) {
		UserVO userVO = new UserVO();
		userVO.setId(1);
		userVO.setAge(23);
		userVO.setName("Guang");
		return userVO;
	}

}
