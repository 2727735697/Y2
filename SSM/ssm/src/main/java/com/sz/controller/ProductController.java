package com.sz.controller;

import com.github.pagehelper.PageInfo;
import com.sz.pojo.product;
import com.sz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制层
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/query/page/{pageNo}/{pageSize}")
    public String infoProduct(
            @PathVariable("pageNo") Integer pageNo,
            @PathVariable("pageSize") Integer pageSize,
            Model model
    ){
        PageInfo<product> pageInfo = productService.infoProductService(pageNo,pageSize);
        model.addAttribute("page",pageInfo);
        return "product/index";
    }

}
