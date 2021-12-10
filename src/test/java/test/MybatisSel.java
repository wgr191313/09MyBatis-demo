package test;

import com.wangguanru.mybatis.dao.UserDao;
import com.wangguanru.mybatis.dao.impl.UserDaoMyBatisImpl;
import com.wangguanru.mybatis.entity.User;

import java.util.List;

public class MybatisSel {
    public static void main(String[] args) {
        UserDao userDao=new UserDaoMyBatisImpl();
        List<User> users =userDao.findAll();
        for(User user:
                users){
            System.out.println(user);
        }
    }
}
