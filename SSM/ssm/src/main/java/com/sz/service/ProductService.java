package com.sz.service;

import com.github.pagehelper.PageInfo;
import com.sz.pojo.product;

public interface ProductService {

    /**
     * 分页查询
     * @param pageNo 当前页码
     * @param pageSize 页面大小
     * @return
     */
    PageInfo<product> infoProductService(Integer pageNo,Integer pageSize);

}
