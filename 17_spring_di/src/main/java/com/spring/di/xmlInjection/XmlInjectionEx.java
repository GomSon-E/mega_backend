package com.spring.di.xmlInjection;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;

// xml파일에서 생성된 객체를 class에 주입시킨다.

@Controller
public class XmlInjectionEx {

	// servlet-context.xml 파일의 객체를 주입
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	// root-context.xml 파일의 객체를 주입
	// @Autowired
	// private SqlSession sqlSession;
	
}
