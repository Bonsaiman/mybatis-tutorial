package mybatis;

import mybatis.entity.User;
import mybatis.mapper.UserMapper;
import mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

class MybatisTest {


    @Test
    void crudTest() {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        mapper.insertUser();

//        mapper.getUserList();
//        List<User> list = mapper.getUserList();
//        list.forEach(e -> System.out.println(e));

        User user = mapper.getUserByUserName("Messi");
        System.out.println(user);


    }

}