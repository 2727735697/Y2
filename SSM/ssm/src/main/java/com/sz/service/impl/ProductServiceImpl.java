package com.sz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sz.pojo.product;
import com.sz.mapper.ProductMapper;
import com.sz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public PageInfo<product> infoProductService(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<product> li = productMapper.info();
        // 调用这个构造器，我们的分页助手对象就构建成功
        PageInfo<product> pageInfo = new PageInfo<product>(li);
        return pageInfo;
    }
}
