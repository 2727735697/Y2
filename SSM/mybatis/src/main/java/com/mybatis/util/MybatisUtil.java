package com.mybatis.util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
public class MybatisUtil {

    public static SqlSessionFactory sqlSessionFactory=null;

    static {
        try{
            InputStream in = Resources.getResourceAsStream("mybatis.cfg.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession sqlSessionOpen(){
        return sqlSessionFactory.openSession();
    }

}
