package by.les10.service.impl;

import by.les10.bean.User;
import by.les10.dao.DaoException;
import by.les10.dao.DaoProvider;
import by.les10.dao.UserDao;
import by.les10.service.ServiceException;
import by.les10.service.UserSetvice;
import by.les10.service.validation.UserDataValidator;

public class UserServiceImpl implements UserSetvice {
    private static final UserDataValidator validator = UserDataValidator.getInstance();

    @Override
    public User authoruzation(String login, String password) throws ServiceException {
        if (!validator.check(login,password)){
        throw new ServiceException("Ошибка сервиса эксепшина");

        }
        UserDao userDao = DaoProvider.getInstance().getUserDao();
        User user;
        try {
            user = userDao.authorization(login,password);
        } catch (DaoException e){
            throw new ServiceException(e);

        }
        return user  ;
    }
}
