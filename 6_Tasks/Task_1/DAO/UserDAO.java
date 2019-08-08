package by.peleng.java.DAO;

import by.peleng.java.entity.RegistrationInfo;
import by.peleng.java.entity.User;

import java.util.List;
import java.util.Set;

public interface UserDAO {
    User logination(String login, String password);
    boolean registration (RegistrationInfo newUser);
    boolean remove(String login);
    Set<String> getAdminEmail(Set<User> user);
    Set<String> getUserEmail(Set<User> user);
    Set<User> getUserList();


}
