package com.spring.di.tobe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/*

	# 의존성 주입(Dependency Injection)
	
	 	- '클래스간의 의존관계'를 IoC 컨테이너가 연결해주는 것
		- 컨테이너가 흐름의 주체가 되어 애플리케이션 코드에 의존관계를 주입해 주는 것이다.
		- 개발자들은 단지 설정파일 및 컴포넌트로 의존관계가 필요하다는 정보를 추가하면 된다.
	
		[동작과정]
		1) 구현 클래스의 정보를 xml(설정파일)에 기술 하거나 클래스에 어노테이션을 명시한다. 
		2) Framework(IoC Container)에서 설정파일을 읽거나 어노테이션을 읽어들인다. 
		3) 구현객체를 생성하며 서로 의존관계가 있는지 확인하여 객체를 연결한다.
	
	
		[의존관계 주입 어노테이션]
	 	@Autowired	: 스프링 어노테이션 , 타입에 맞추어서 연결	
	 	@Inject		: 자바 표준 어노테이션 , 타입에 맞추어서 연결 , Dependency추가 이후 사용 가능
	 	@Resource	: 자바 표준 어노테이션 , 이름에 맞추어서 연결
	
	
	
	# IoC(Inversion of Control) , IoC Container
	
		- 스프링 프레임워크는 객체에 대한 생성 및 생명주기를 관리할 수 있는 기능을 제공하고 있다.
		- IoC(제어권의 역전)이란, 객체의 생성, 생명주기의 관리까지 모든 객체에 대한 제어권이 바뀌었다는 것을 의미한다.
			1) 객체 생성 순서의 역전	2) 개발자 > 프레임워크
		- 개발자들이 직접 POJO를 생성할 수 있지만 컨테이너에게 맡긴다.
		- IoC 컨테이너는 객체의 생성을 책임지고, 의존성을 관리한다.
		- 스프링 프레임워크에서 객체에 대한 생성 및 연결 및 생명주기를 관리할 수 있는 기능을 IoC 컨테이너를 이용하여 제공하고 있다.
		- POJO의 생성, 초기화, 서비스, 소멸에 대한 권한을 가지며 작업을 처리한다.

*/

@Controller // 해당 클래스가 Controller을 spring bean에 등록한다.
public class TobeController {

	// IoC컨테이너에 의해서 ToBeDao , ToBeService , ToBeController 객체가 생성 및 관리되며
	// ToBeDao > ToBeService ToBeController의 순서로 객체가 조립된다.
	// 외부에서 생성된 객체를 주입한다. > 결합력(의존성)이 약하다.
	
	@Autowired // @Inject
	private TobeService tobeService; 
	
}
