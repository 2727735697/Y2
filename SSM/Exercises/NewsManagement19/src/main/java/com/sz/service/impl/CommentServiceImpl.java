package com.sz.service.impl;

import com.sz.pojo.Comment;
import com.sz.mapper.CommentMapper;
import com.sz.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> infoAll() {
        return commentMapper.InfoAll();
    }
}
