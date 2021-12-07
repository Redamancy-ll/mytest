package edu.soft2.service.impl;

import edu.soft2.dao.UserDao;
import edu.soft2.pojo.User;
import edu.soft2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    //set方法注入
//    @Autowired
//    @Qualifier("userDaoImpl")
//    public void setUserDao(UserDao userDao){
//        this.userDao = userDao;
//    }
    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
    @Override
    public int deleUser(User user) {
        return userDao.deleUser(user);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int queryUser(User user) {
        return userDao.queryUser(user);
    }
}

