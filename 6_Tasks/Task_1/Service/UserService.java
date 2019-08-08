package by.peleng.java.Service;


import by.peleng.java.entity.RegistrationInfo;
import by.peleng.java.entity.User;

public interface UserService {
        User logination(String login, String password);
        Boolean registration (RegistrationInfo newUser);

    }


