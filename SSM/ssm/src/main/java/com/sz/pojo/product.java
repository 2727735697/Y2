package com.sz.pojo;

public class product {

    private static final long serialVersionUID = 1520497291186531512L;

    private Integer id;
    private String name;
    private Integer price;
    private String introduce;

    public product() {
    }

    public product(String name, Integer price, String introduce) {
        this.name = name;
        this.price = price;
        this.introduce = introduce;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
