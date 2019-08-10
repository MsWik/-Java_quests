package by.peleng.java.impl;

import by.peleng.java.DAO.UserDAO;
import by.peleng.java.entity.RegistrationInfo;
import by.peleng.java.entity.User;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FileUserDAO implements UserDAO {
    private static final FileUserDAO instance = new FileUserDAO();


    public static FileUserDAO getInstance() {
        return instance;
    }

    private FileUserDAO() {
    }

    public User toUser(String users) {
        User userNew = new User();
        String[] userSplit = users.split("\\|");
        //   System.out.println(Arrays.toString(userSplit));
        userNew.setId(Integer.parseInt(userSplit[0].split("=")[1]));
        userNew.setName(userSplit[1].split("=")[1]);
        userNew.setFamali(userSplit[2].split("=")[1]);
        userNew.setEmail(userSplit[3].split("=")[1]);
        userNew.setAge(userSplit[4].split("=")[1]);
        userNew.setLogin(userSplit[5].split("=")[1]);
        userNew.setPassword(userSplit[6].split("=")[1]);
        userNew.setAdmin(Boolean.parseBoolean(userSplit[7].split("=")[1]));


        return userNew;
    }


    @Override
    public User logination(String login, String password) {
   /*     String s;
        String loginList="";*/

        try {

            List<String> loginListAr = new ArrayList<>();
            List<String> lines = Files.readAllLines(Paths.get("./resourсes/login.txt"), UTF_8);
            for (String line : lines) {
                loginListAr.add(line);
                //         System.out.println(line);
            }

/*
            BufferedReader br = new BufferedReader(new FileReader("login.txt"));

            while ((s = br.readLine()) != null) {
                loginListAr.add(s);
                System.out.println(s);
            }
            br.close();
   //         System.out.println(loginList);
    //       String loginListAr[]=loginList.split("\n");
       //    System.out.println(Arrays.toString(loginListAr));*/
            for (String count : loginListAr) {
                int pas;
                int log;
                pas = count.indexOf(Integer.toString(password.hashCode()));
                log = count.indexOf(login);

                if (pas != -1 && log != -1) {
                    return toUser(count);

                }

            }


        } catch (FileNotFoundException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
            e.printStackTrace();

        }
        return null;
    }


    @Override
    public boolean registration(RegistrationInfo newUser) {
        Writer writer = null;
        try {


            String str = newUser.toString();


            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("./resourсes/login.txt", true), "utf-8"));
            writer.write(str);
            //   System.out.println(str);
            writer.flush();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("Ошибка ввода-вывода: ");
            return false;
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка ввода-вывода: ");
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: ");
            e.printStackTrace();
            return false;
        }

        return true;


    }

    @Override
    public boolean remove(String login) {


        Writer writer = null;
        String s;
        String loginList = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("./resourсes/login.txt"));
            while ((s = br.readLine()) != null) {
                loginList += s + "\n";
            }

            List<String> loginListAr = new LinkedList<String>(
                    Arrays.asList(loginList.split("\n")));

            for (int i = 0; i < loginListAr.size(); i++) {
                int numberLogin;
                String count = loginListAr.get(i);
                numberLogin = count.indexOf(login);
                if (numberLogin != -1) {

                    loginListAr.remove(i);
                }

            }
            br.close();
            System.out.println(loginListAr);
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("./resourсes/login.txt", false), "utf-8"));
            String finalStringAdd = "";
            for (String count : loginListAr) {
                finalStringAdd += count + "\n";
            }
            writer.write(finalStringAdd);
            //   System.out.println(str);
            writer.flush();


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("Ошибка ввода-вывода: ");
            return false;
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка ввода-вывода: ");
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: ");
            e.printStackTrace();
            return false;
        }

        return true;


    }

    @Override
    public Set<String> getAdminEmail(Set<User> user) {
        Set<String> adminEmail = new HashSet<>();
        for (User users:user){
            if(users.isAdmin()){
                adminEmail.add(users.getEmail());
            }
        }

        return adminEmail;
    }

    @Override
    public Set<String> getUserEmail(Set<User> user) {
        Set<String> userEmail = new HashSet<>();
        for (User users:user){
            if(!users.isAdmin()){
                userEmail.add(users.getEmail());
            }
        }

        return userEmail;
    }

    @Override
    public Set<User> getUserList() {
        Set<User> setUse = new HashSet<>();

        try {


            List<String> lines = Files.readAllLines(Paths.get("./resourсes/login.txt"), UTF_8);
            for (String line : lines) {
                setUse.add(toUser(line));

            }

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
            e.printStackTrace();
            return null;

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
            e.printStackTrace();
            return null;
        }
        return setUse;


    }


}

