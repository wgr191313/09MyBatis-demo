package test;

import com.wangguanru.mybatis.dao.UserDao;
import com.wangguanru.mybatis.dao.impl.UserDaoMyBatisImpl;
import com.wangguanru.mybatis.entity.User;
import org.junit.Assert;

import java.util.Date;

public class MyBatisUpdate {
    public static void main(String[] args) {
        UserDao userDao=new UserDaoMyBatisImpl();
        User user=new User();
        user.setId(5);
        user.setPwd("123456");
        user.setName("zhangyang");
        user.setAge(22);
        user.setBirthday(new Date(2000,1,1));
        int ret=userDao.update(user);
        System.out.println(ret);
        Assert.assertEquals(1,ret);

    }
}

