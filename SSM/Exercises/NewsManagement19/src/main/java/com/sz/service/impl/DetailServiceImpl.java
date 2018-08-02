package com.sz.service.impl;

import com.sz.mapper.DetailMapper;
import com.sz.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("detailService")
public class DetailServiceImpl implements DetailService {

    @Autowired
    private DetailMapper detailMapper;

    @Override
    public int delete(Integer id) {
        return detailMapper.delete(id);
    }
}
