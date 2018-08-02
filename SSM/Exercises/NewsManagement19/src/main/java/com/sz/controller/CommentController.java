package com.sz.controller;

import com.sz.pojo.Comment;
import com.sz.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    /**
     * 查询所有
     * @param model
     * @return
     */
    @RequestMapping("/")
    public String index(Model model){

        List<Comment> details =  commentService.infoAll();

        model.addAttribute("details",details);

        return "index";

    }

}
