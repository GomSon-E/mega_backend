package com.spring.di.tobe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // 해당 클래스가 DAO임을 spring bean에 등록한다.
public class TobeDaoImpl implements TobeDao {
	
	@Autowired
	private TobeDao tobeDao;
	

}
