package com.mapper.entity;

public class familyPerson {

    private Integer person_id;  //编号
    private String person_name; //作者姓名
    private familyBookFile familybookFile;  //对象类型

    @Override
    public String toString() {
        return "familyPerson{" +
                ", person_name='" + person_name + '\'' +
                '}';
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public familyBookFile getFamilybookFile() {
        return familybookFile;
    }

    public void setFamilybookFile(familyBookFile familybookFile) {
        this.familybookFile = familybookFile;
    }
}
