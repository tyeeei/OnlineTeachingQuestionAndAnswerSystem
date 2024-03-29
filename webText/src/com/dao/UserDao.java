package com.dao;

import com.pojo.User;
import java.util.List;

public interface UserDao {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 如果返回null, 说明没有这个用户。反之亦然
     */
    User queryUserByUsername(String username);

    /**
     * 根据 用户名和密码查询用户信息
     *
     * @param username
     * @param password
     * @return 如果返回null, 说明用户名或密码错误, 反之亦然
     */
    User queryUserByUsernameAndPassword(String username, String password);

    /**
     * 保存用户信息
     *
     * @param user
     * @return 返回-1表示操作失败，其他是sql语句影响的行数
     */
    int saveUser(User user);

    /**
     * 更新用户信息
     *
     * @param user
     * @return 返回-1表示操作失败，其他是sql语句影响的行数
     */
    int updateUser(User user);

    //查询总页数
    Integer queryForPageTotalCount();

    //查询当前页下的用户
    List<User> queryForPageItems(int begin, int pageSize);

    //删除一个用户
    int deleteUserById(Integer id);

    //根据searchName查询当前页下的用户
    List<User> queryForPageItemsBySearchName(int begin, int pageSize, String searchName);
}
