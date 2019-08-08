package by.peleng.java.Start;

import by.peleng.java.DAO.UserDAO;
import by.peleng.java.controller.impl.AdminCommand;
import by.peleng.java.controller.impl.UserCommand;
import by.peleng.java.entity.RegistrationInfo;
import by.peleng.java.entity.User;
import by.peleng.java.impl.FileUserDAO;


import javax.mail.MessagingException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, MessagingException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        UserDAO provider = FileUserDAO.getInstance();

        String str = null;


        do {

            System.out.println("1)Регистрация нового пользователя");
            System.out.println("2)Авторизация пользователя");


            System.out.println("-------------");


            int keys = 0;
            try {
                keys = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {

                System.out.println("Не корректно указано число, попробуйте снова");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Не корректно указано число, попробуйте снова");
            }


            switch (keys) {
                case (1):
                    RegistrationInfo registrationInfo = new RegistrationInfo();
                    try {
                        registrationInfo.regestration();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    provider.registration(registrationInfo);


                    break;
                case (2):
                    System.out.println("-------------");
                    System.out.println("Введите логин");
                    String login = reader.readLine();
                    System.out.println("Введите пароль");
                    String password = reader.readLine();
                    if (provider.logination(login, password) != null) {
                        User users =provider.logination(login, password);
                        System.out.println("Добро пожаловать");
                        System.out.println(users.getName()
                                + "  " + users.getFamali()
                        );
                        if (!users.isAdmin()){
                            UserCommand userCommand =new UserCommand();
                            userCommand.userCommand(users);

                        } else {
                            AdminCommand adminCommand = new AdminCommand();
                            adminCommand.adminCommand(users);
                        }






                    } else {
                        System.out.println("Не верный ввод данных" + "\n" + "Пользователя " + login
                                + "\n" + "с поролем " + password + "\n" +
                                "НЕ СУЩЕСТВУЕТ");
                    }


                    break;



                default:
                    System.out.println("Не верный выбор. Попробуйте еще раз ");

                    break;

            }

            System.out.print("Закончить  Y/N: ");

            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.print("Не корректный ввод: ");

            }
        } while (!str.equals("Y"));


    }
}
