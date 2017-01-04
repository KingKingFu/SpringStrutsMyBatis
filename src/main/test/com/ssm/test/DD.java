package com.ssm.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/1/3.
 */
public class DD {
    @Test
    public void dd(){
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(act);
    }
}
