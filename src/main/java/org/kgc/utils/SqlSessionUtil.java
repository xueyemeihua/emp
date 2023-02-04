package org.kgc.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author ly@雪夜梅花香
 * @create 2023-01-13-15:11
 */
public class SqlSessionUtil {

    //防止类外部访问,设置为私有静态
    private static SqlSessionFactory sqlSessionFactory = null;
    static {
        String source = "mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(source);
        }catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }

    public static SqlSession getSqlSession () {
        //打开的session默认是关闭事务自动提交的
        return sqlSessionFactory.openSession();
    }

    public static SqlSession getSqlSession(Boolean flag) {
        //打开的session默认是关闭事务自动提交的
        return sqlSessionFactory.openSession(flag);
    }

    public  static void closeConnection(SqlSession sqlSession) {
        if (sqlSession!=null) {
            sqlSession.close();
        }
    }

}
