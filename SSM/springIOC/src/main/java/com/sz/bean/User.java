package com.sz.bean;

public class User {

    private String name;    //姓名
    private String word;    //说的话

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", word='" + word + '\'' +
                '}';
    }

    public void userName() {
        System.out.println(name + " 说：" + "“"+word+"”");
    }

    public void userWord(){
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
