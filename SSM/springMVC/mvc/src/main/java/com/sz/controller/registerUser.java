package com.sz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.sz.user.userInfo;

@RestController
@RequestMapping("/user")
public class registerUser {

    @RequestMapping("/info")
    /**
     * 传统方法
     */
    public Map<String,Object> Info(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        String name = request.getParameter("name");
        String age_ = request.getParameter("age");
        Double age = Double.valueOf(age_);
        String birth = request.getParameter("birth");

        System.out.println(name);
        System.out.println(age);
        System.out.println(birth);
        map.put("code",2000);
        map.put("msg","添加成功");
        return map;
    }

    @RequestMapping("/info2")
    /**
     * 适用于两三个属性的方法
     */
    public Map<String,Object> Info2(
            @RequestParam("name") String name,
            @RequestParam("age") Integer age
            ){
        Map<String,Object> map = new HashMap<>();

        System.out.println(name + age);
        map.put("code",2000);
        map.put("msg","添加成功");
        return map;
    }

    @RequestMapping("/info3")
    /**
     * 直接以Javabean提交
     * form表单的name必须和javabean的name一致
     */
    public Map<String,Object> Info3(userInfo info){
        Map<String,Object> map = new HashMap<>();

        System.out.println(info);
        map.put("code",2000);
        map.put("msg","天假成功");
        return map;
    }

}
