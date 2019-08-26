package by.les10.service;

import by.les10.service.impl.UserServiceImpl;

public class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();

    private ServiceProvider() {
    }
    private UserSetvice userSetvice = new UserServiceImpl();

    public UserSetvice getUserSetvice() {
        return userSetvice;
    }

    public static ServiceProvider getInstance() {
        return instance;
    }
}
