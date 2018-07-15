package com.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.mapper.util.familyUtil;
import com.mapper.mapper.familyMapper;
import com.mapper.entity.familyBookFile;

import java.util.List;

public class test {

    /**
     * one to n
     */
    @Test
    public void seleteFamilyInfo() {
        SqlSession sqlSession = null;
        try {
            sqlSession = familyUtil.sqlSessionOpen();
            familyMapper familymapper = sqlSession.getMapper(familyMapper.class);
            List<familyBookFile> list = familymapper.seleteFamilyInfo(2);
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
     * n to one
     */
    @Test
    public void nToOne() {
        SqlSession sqlSession = null;
        try {
            sqlSession = familyUtil.sqlSessionOpen();
            familyMapper familymapper = sqlSession.getMapper(familyMapper.class);
            List<familyBookFile> list = familymapper.seleteFamily(2, 3);
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
