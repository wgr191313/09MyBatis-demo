package test;

import com.wangguanru.mybatis.dao.UserDao;
import org.junit.Assert;
import org.junit.Before;
import com.wangguanru.mybatis.dao.impl.UserDaoMyBatisImpl;
import org.junit.Test;

public class MyBatisTest {
    private UserDao userDao;
    @Before
    public void init(){
        userDao=new UserDaoMyBatisImpl();
    }

    @Test
    public void testDel(){
        int ret=userDao.delete(9);
        //System.out.println(ret);
        //判断实际值和期望值是否一致
        Assert.assertEquals(1,ret);
    }



}
