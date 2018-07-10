package com.mybatis.mapper;

import java.util.List;
import com.mybatis.entity.MybatisEntity;

public interface MyBatisMapper {

    List<MybatisEntity> MybatisInfo();

    int MybatisDelete(int id);

    int MybatisAdd(MybatisEntity add);

    int MybatisUpdate(MybatisEntity update);

}
