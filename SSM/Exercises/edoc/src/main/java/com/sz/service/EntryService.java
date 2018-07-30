package com.sz.service;

import com.github.pagehelper.PageInfo;
import com.sz.pojo.Entry;

public interface EntryService {

    PageInfo<Entry> listAll();

    PageInfo<Entry> listWithPage(Integer pageNum,Long categoryId);

    int delete(Integer id);

}
