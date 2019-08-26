package by.les10.service;

import by.les10.bean.User;

public interface UserSetvice {
    User authoruzation (String login, String password) throws ServiceException;
}
