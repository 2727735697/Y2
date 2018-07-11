package com.mapper;

import com.mapper.util.dynamicSQLUtil;
import org.apache.ibatis.session.SqlSession;
import com.mapper.mapper.dynamicSQLMapper;
import com.mapper.entity.dynamicSQLEntity;
import org.junit.Test;

import java.util.List;

public class test {

    /**
     * 按条件查询
     */
    @Test
    public void selectDynamicSQL() {
        SqlSession sqlSession = null;
        try {
            sqlSession = dynamicSQLUtil.sqlSessionOpen();
            dynamicSQLMapper mapper = sqlSession.getMapper(dynamicSQLMapper.class);
            dynamicSQLEntity dynamicEntity = new dynamicSQLEntity();
            dynamicEntity.setId(3);
            dynamicEntity.setBookName("java");
            List<dynamicSQLEntity> list = mapper.seleceDynamicSQL(dynamicEntity);
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    /**
     * 按条件删除
     */
    @Test
    public void deleteDynamicSQL() {
        SqlSession sqlSession = null;
        try {
            dynamicSQLEntity dynamicEntity = new dynamicSQLEntity();
            dynamicEntity.setId(24);
            dynamicEntity.setBookName(null);
            sqlSession = dynamicSQLUtil.sqlSessionOpen();
            int count = sqlSession.getMapper(dynamicSQLMapper.class).deleteDynamicSQL(dynamicEntity);
            System.out.println("操作行数:" + count);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    /**
     * 按条件增加
     */
    @Test
    public void addDynamicSQL() {
        SqlSession sqlSession = null;
        try {
            sqlSession = dynamicSQLUtil.sqlSessionOpen();
            dynamicSQLMapper dynamicMapper = sqlSession.getMapper(dynamicSQLMapper.class);
            dynamicSQLEntity dynamicEntity = new dynamicSQLEntity();
            dynamicEntity.setISBN(23456789);
            dynamicEntity.setBookName("C#");
            dynamicEntity.setPrice(100);
            dynamicEntity.setPublisher("邪魂网络");
            dynamicEntity.setDiscount(2);
            int count = dynamicMapper.addDynamicSQL(dynamicEntity);
            System.out.println("操作行数:" + count);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    /**
     * 按条件修改
     */
    @Test
    public void updateDynamicSQL() {
        SqlSession sqlSession = null;
        try {
            sqlSession = dynamicSQLUtil.sqlSessionOpen();
            dynamicSQLMapper dynamicMapper = sqlSession.getMapper(dynamicSQLMapper.class);
            dynamicSQLEntity dynamicEntity = new dynamicSQLEntity();
            dynamicEntity.setId(25);
            dynamicEntity.setISBN(23456789);
            dynamicEntity.setBookName("C#");
            dynamicEntity.setPrice(100);
            dynamicEntity.setPublisher("哈哈哈哈");
            dynamicEntity.setDiscount(2);
            int count = dynamicMapper.updateDynamicSQL(dynamicEntity);
            System.out.println("操作行数:" + count);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
