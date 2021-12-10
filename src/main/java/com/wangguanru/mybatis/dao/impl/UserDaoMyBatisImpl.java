package com.wangguanru.mybatis.dao.impl;

import com.wangguanru.mybatis.dao.UserDao;
import com.wangguanru.mybatis.entity.User;
import com.wangguanru.mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoMyBatisImpl implements UserDao {
    @Override
    public int save(User user) {
        SqlSession sqlSession=null;
        int ret=0;
        try{
            sqlSession= MyBatisUtil.getSqlSession();
            ret=sqlSession.insert("com.wangguanru.mybatis.dao.UserDao.save",user);
            sqlSession.commit();
        }catch (Exception e){
            if(sqlSession!=null){
                sqlSession.rollback();
            }
            e.printStackTrace();
        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
        return ret;
    }

    @Override
    public List<User> findAll() {
        SqlSession sqlSession=null;
        try{
            sqlSession= MyBatisUtil.getSqlSession();
            List<User> ret=sqlSession.selectList("com.wangguanru.mybatis.dao.UserDao.findAll");
            return ret;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
        return null;
    }

    @Override
    public int update(User user) {
        SqlSession sqlSession=null;
        int ret=0;
        try{
            sqlSession= MyBatisUtil.getSqlSession();
            ret=sqlSession.insert("com.wangguanru.mybatis.dao.UserDao.update",user);
            sqlSession.commit();
        }catch (Exception e){
            if(sqlSession!=null){
                sqlSession.rollback();
            }
            e.printStackTrace();
        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
        return ret;
    }

    @Override
    public int delete(int id) {
        SqlSession sqlSession=null;
        int ret=0;
        try{
            sqlSession= MyBatisUtil.getSqlSession();
            ret=sqlSession.insert("com.wangguanru.mybatis.dao.UserDao.delete",id);
            sqlSession.commit();
        }catch (Exception e){
            if(sqlSession!=null){
                sqlSession.rollback();
            }
            e.printStackTrace();
        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
        return ret;
    }

    @Override
    public User getUserById(Integer id) {
        SqlSession sqlSession=null;
        try{
            sqlSession= MyBatisUtil.getSqlSession();
            User ret=sqlSession.selectOne("com.wangguanru.mybatis.dao.UserDao.find",id);
            return ret;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
        return null;
    }
}
