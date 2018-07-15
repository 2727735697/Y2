package com.mapper.entity;

public class familyBookFile {

    private Integer id; //图书编号
    private Integer ISBN;   //图书编码
    private String name;    //图书名称
    private Integer price;  //图书价格
    private Integer discount;   //图书折扣
    private String publisher;   //图书出版社
    private familyPerson familyperson;  //对象类型

    @Override
    public String toString() {
        return "familyBookFile{" +
                "id=" + id +
                "name=" + name +
                ", familyperson=" + familyperson +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public familyPerson getFamilyperson() {
        return familyperson;
    }

    public void setFamilyperson(familyPerson familyperson) {
        this.familyperson = familyperson;
    }
}
