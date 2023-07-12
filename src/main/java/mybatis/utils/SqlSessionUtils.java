package mybatis.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtils {


    public static SqlSession getSqlSession(){

        SqlSession sqlSession = null;

        try {
            // get mybatisConfig
            InputStream inputStream = Resources.getResourceAsStream("mybatisConfig.xml");

            // get SqlSessionFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

            // get SqlSessionFactory，build SqlSession
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

            //get SqlSession
            sqlSession = sqlSessionFactory.openSession(true);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return sqlSession;
    }


}
