package edu.soft2.dao;

import edu.soft2.pojo.User;

public interface UserDao {
    /**
     * 增加用户
     * @param user
     * @return
     */
    public int addUser(User user);
    /**
     * 删除用户
     */
    public int deleUser(User user);
    /**
     * 改
     */
    public int update(User user);
    /**
     * 查
     */
    public int queryUser(User user);
}
