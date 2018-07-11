package com.mapper.entity;

public class dynamicSQLEntity {

    private Integer id;
    private  Integer ISBN;
    private String bookName;
    private Integer price;
    private String publisher;
    private  Integer discount;

    @Override
    public String toString() {
        return "dynamicSQLEntity{" +
                "id=" + id +
                ", ISBN=" + ISBN +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                ", discount=" + discount +
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

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
}
