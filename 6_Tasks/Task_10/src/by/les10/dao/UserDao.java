package by.les10.dao;

import by.les10.bean.User;

public interface UserDao {

    User authorization(String login, String password) throws DaoException;
}
