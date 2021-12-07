package edu.soft2.service;

import edu.soft2.pojo.User;

public interface UserService {
    public int addUser(User user);
    public int deleUser(User user);
    public int update(User user);
    public int queryUser(User user);
}
