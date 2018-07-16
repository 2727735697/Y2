package com.springKnow;

public class springKnowUtil {

    private String name;
    private Integer age;
    private String liveBook;

    @Override
    public String toString() {
        return "springKnowUtil{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", liveBook='" + liveBook + '\'' +
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

    public String getLiveBook() {
        return liveBook;
    }

    public void setLiveBook(String liveBook) {
        this.liveBook = liveBook;
    }
}
