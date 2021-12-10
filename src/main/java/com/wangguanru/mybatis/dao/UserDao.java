package com.wangguanru.mybatis.dao;

import com.wangguanru.mybatis.entity.User;

import java.util.List;

public interface UserDao {
    int save(User user);
    List<User> findAll();
    int update(User user);
    int delete(int id);
    User getUserById(Integer id);
}
