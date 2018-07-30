package com.sz.pojo;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {

    private static final long serialVersionUID = 1332431192436602951L;

    private Integer id;
    private String name;
    private List<Entry> entries;

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

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }
}
