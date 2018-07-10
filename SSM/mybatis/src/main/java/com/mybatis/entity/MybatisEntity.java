package com.mybatis.entity;

public class MybatisEntity {

    private Integer id;     //编号
    private Integer ISBN;       //一套书编号
    private String bookName;        //书名
    private Integer price;      //价格
    private String publisher;       //出版社
    private Integer discount;       //折扣

    @Override
    public String toString() {
        return "bookEntity{" +
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
