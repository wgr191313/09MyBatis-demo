package test;

import com.wangguanru.mybatis.dao.UserDao;
import com.wangguanru.mybatis.dao.impl.UserDaoMyBatisImpl;
import org.junit.Assert;

public class MyBatisDelete {
    public static void main(String[] args) {
        UserDao userDao=new UserDaoMyBatisImpl();
        int ret=userDao.delete(4);
        System.out.println(ret);
        Assert.assertEquals(1,ret);

    }
}

