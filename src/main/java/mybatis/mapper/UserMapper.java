package mybatis.mapper;

import mybatis.entity.User;

import java.util.List;

public interface UserMapper {

    void insertUser();

    void deleteUser(int id);

    void updateUser(int id);

    User getUserById(int id);

    User getUserByUserName(String userName);

    List<User> getUserList();
}
