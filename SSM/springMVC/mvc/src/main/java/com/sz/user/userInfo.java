package com.sz.user;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class userInfo {

    private String name;    //姓名
    private Integer age;    //年龄
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss" ,
            timezone = "GMT+8")
    private Date birth;     //出生日期

    @Override
    public String toString() {
        return "userInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
