package com.ssm.dao;

import com.ssm.domain.Dept;
import com.ssm.service.DeptService;
import com.ssm.service.impl.DeptServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class DeptMapperTest {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DeptMapper deptMapper;

    @Before
    public void setUp() throws Exception {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        deptService= (DeptService) act.getBean("deptServiceImpl");
//          deptMapper= (DeptMapper) act.getBean("deptMapper");
    }

    @Test
    public void deleteByPrimaryKey() throws Exception {

    }

    @Test
    public void insert() throws Exception {

    }

    @Test
    public void insertSelective() throws Exception {

    }

    @Test
    public void selectByPrimaryKey() throws Exception {
        System.out.println(deptService);
//        System.out.println(deptMapper.selectByPrimaryKey(10));
        System.out.println(deptService.findDeptByNo(10));
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {

    }

    @Test
    public void updateByPrimaryKey() throws Exception {

    }

}