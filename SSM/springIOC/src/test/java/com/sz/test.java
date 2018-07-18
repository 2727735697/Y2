package com.sz;

import com.sz.bean.User;
import com.sz.most.Girl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class test {

    @Test
    public void testUser(){
        ApplicationContext app = new ClassPathXmlApplicationContext("UserInfo.xml");
        User user = (User) app.getBean("user");
        User user2 = (User) app.getBean("user2");
        System.out.println(user);
        System.out.println(user2);
    }

    @Test
    public void testGirl(){
        ApplicationContext app = new ClassPathXmlApplicationContext("GirlInfo.xml");
        Girl girl = (Girl) app.getBean("girl");
        System.out.println(girl.getColour());

        Girl girl2 = (Girl) app.getBean("girl2");
        System.out.println(Arrays.toString(girl2.getAnimal()));

        Girl girl3 = (Girl) app.getBean("girl3");
        System.out.println(girl3.getUserSet());

    }
}
