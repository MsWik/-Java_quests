package by.les10.service.validation;

public class UserDataValidator {
    private static final UserDataValidator instance= new UserDataValidator();
    public boolean check(String login, String password){
        return true;
    }

    public static UserDataValidator getInstance() {

        return instance;
    }

    private UserDataValidator() {
    }
}
