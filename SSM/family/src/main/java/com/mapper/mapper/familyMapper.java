package com.mapper.mapper;

import java.util.List;
import com.mapper.entity.familyBookFile;
import org.apache.ibatis.annotations.Param;

public interface familyMapper {

    /**
     * 查询夺表
     * @param info
     * @return
     */
    List<familyBookFile> seleteFamilyInfo(@Param("info") Integer info);

    List<familyBookFile> seleteFamily(@Param("id") Integer id, @Param("person_id") Integer person_id);


}
