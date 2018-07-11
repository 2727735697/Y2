package com.mapper.mapper;

import java.util.List;
import com.mapper.entity.dynamicSQLEntity;

public interface dynamicSQLMapper {

    /**
     * 按条件查询
     * @return
     */
    List<dynamicSQLEntity> seleceDynamicSQL(dynamicSQLEntity infoDynamicSQL);

    /**
     * 按条件删除
     * @param deleteDynamicSQL
     * @return
     */
    int deleteDynamicSQL(dynamicSQLEntity deleteDynamicSQL);

    /**
     * 按条件增加
     * @param addDynamicSQL
     * @return
     */
    int addDynamicSQL(dynamicSQLEntity addDynamicSQL);

    int updateDynamicSQL(dynamicSQLEntity updateDynamicSQL);

}
