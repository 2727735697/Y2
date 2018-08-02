package com.sz.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 新闻实体类
 */
public class Comment implements Serializable {

    private static final long serialVersionUID = -643654665244300602L;

    private int id;

    private String title;

    private String summary;

    private String author;

    private Date createdate;

    private List<Detail> details;

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
