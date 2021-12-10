package test;

import com.wangguanru.mybatis.dao.UserDao;
import com.wangguanru.mybatis.dao.impl.UserDaoMyBatisImpl;
import com.wangguanru.mybatis.entity.User;

public class MybatisSave {
    public static void main(String[] args) {
        UserDao userDao=new UserDaoMyBatisImpl();
        User user=new User();
        user.setName("王冠儒");
        user.setAge(21);
        int ret =userDao.save(user);
        System.out.println(ret);
    }
}
