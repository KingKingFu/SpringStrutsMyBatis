package com.ssm.action;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ssm.service.DeptService;

@Controller
public class UserAction {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	@Autowired
	private DeptService deptService;
	
	public String fun(){
		System.out.println(sqlSessionFactory);
		System.out.println(deptService.findDeptByNo(10));
		return "input";
	}
}
