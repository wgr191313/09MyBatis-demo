package test;

import com.wangguanru.mybatis.dao.UserDao;
import com.wangguanru.mybatis.dao.impl.UserDaoMyBatisImpl;
import com.wangguanru.mybatis.entity.User;

public class MyBatisFind {
    public static void main(String[] args) {
        UserDao userDao=new UserDaoMyBatisImpl();
        User user=userDao.getUserById(5);
        System.out.println(user);
    }

}

