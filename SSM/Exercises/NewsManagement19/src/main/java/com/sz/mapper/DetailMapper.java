package com.sz.mapper;

import com.sz.pojo.Detail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DetailMapper {

    int delete(@Param("id") Integer id);

}
