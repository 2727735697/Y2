package com.mybatis;

import com.mybatis.entity.MybatisEntity;
import com.mybatis.mapper.MyBatisMapper;
import com.mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {

    @Test
    public void mybatisInfo() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.sqlSessionOpen();
            MyBatisMapper myBatisMapper = sqlSession.getMapper(MyBatisMapper.class);
            List<MybatisEntity> mybatisEntities = myBatisMapper.MybatisInfo();
            System.out.println(mybatisEntities);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    @Test
    public void mybatisDelete() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.sqlSessionOpen();
            MyBatisMapper myBatisMapper = sqlSession.getMapper(MyBatisMapper.class);
            int count = myBatisMapper.MybatisDelete(1);
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

    @Test
    public void mybatisAdd() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.sqlSessionOpen();
            MyBatisMapper myBatisMapper = sqlSession.getMapper(MyBatisMapper.class);
            MybatisEntity mybatisEntity = new MybatisEntity();
            mybatisEntity.setISBN(456789123);
            mybatisEntity.setBookName("C#");
            mybatisEntity.setPrice(28);
            mybatisEntity.setDiscount(8);
            mybatisEntity.setPublisher("北大青鸟");
            int count = myBatisMapper.MybatisAdd(mybatisEntity);
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

    @Test
    public void upBookInfoById(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MybatisUtil.sqlSessionOpen();
            MyBatisMapper myBatisMapper = sqlSession.getMapper(MyBatisMapper.class);
            MybatisEntity mybatisEntity = new MybatisEntity();
            mybatisEntity.setId(2);
            mybatisEntity.setBookName("java");
            mybatisEntity.setISBN(234567891);
            int count = myBatisMapper.MybatisUpdate(mybatisEntity);
            System.out.println("操作行数:"+count);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }

}
