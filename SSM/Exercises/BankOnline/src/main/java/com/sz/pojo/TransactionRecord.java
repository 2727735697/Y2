package com.sz.pojo;

import java.io.Serializable;
import java.util.Date;

public class TransactionRecord implements Serializable {

    private static final long serialVersionUID = -643654665244300602L;

    private Integer id;

    private String cardNo;

    private Date transactionAmount;

    private Double balance;

    private Double transactionType;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Date getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Date transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Double transactionType) {
        this.transactionType = transactionType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
