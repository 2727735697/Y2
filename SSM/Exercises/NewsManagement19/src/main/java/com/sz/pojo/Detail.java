package com.sz.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论实体类
 */
public class Detail implements Serializable {

    private static final long serialVersionUID = -643654665244300602L;

    private Integer id;

    private Comment comment;

    private String content;

    private String author;

    private Date createdate;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
