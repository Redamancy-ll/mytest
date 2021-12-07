package edu.soft2.service.impl;

import edu.soft2.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        UserServiceImpl service = new UserServiceImpl();;
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl service = (UserServiceImpl) context.getBean("userServiceImpl");
        User user = new User();
        user.setName("peter");
        user.setPwd("123");
        user.setEmail("peter@123.com");
        service.addUser(user);
    }
}
