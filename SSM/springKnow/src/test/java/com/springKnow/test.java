package com.springKnow;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void springTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("springKnow.xml");
        springKnowUtil springKnow = (springKnowUtil) context.getBean("utilName");
        System.out.println(springKnow);
    }
}
