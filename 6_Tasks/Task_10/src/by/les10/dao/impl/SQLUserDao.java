package by.les10.dao.impl;

import by.les10.bean.User;
import by.les10.dao.DaoException;
import by.les10.dao.UserDao;

public class SQLUserDao implements UserDao {
    @Override
    public User authorization(String login, String password) throws DaoException {
        User user = new User();
        user.setName("Andrey");
        user.setRole("user");
        return user;
    }
}
