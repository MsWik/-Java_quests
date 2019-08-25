package by.les10.dao;

import by.les10.dao.impl.SQLUserDao;

public class DaoProvider {
    private static final DaoProvider instance = new DaoProvider();

    public static DaoProvider getInstance() {
        return instance;
    }

    private final UserDao userDao = new SQLUserDao();

    public UserDao getUserDao() {
        return userDao;
    }

}
