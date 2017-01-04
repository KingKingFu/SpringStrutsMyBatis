package com.ssm.service.impl;

import com.ssm.dao.DeptMapper;
import com.ssm.domain.Dept;
import com.ssm.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public Dept findDeptByNo(Integer deptno) {
		Dept dept = deptMapper.selectByPrimaryKey(deptno);
		return dept;
	}

}
