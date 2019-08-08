package by.peleng.java.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private String famali;
    private String email;
    private String age;
    private String login;
    private String password;
    private boolean admin;


    @Override
    public String toString() {
        return
                "id=" + id + "|" +
                        ", name=" + name + "|" +
                        ", famali=" + famali + "|" +
                        ", email=" + email + "|" +
                        ", age=" + age + "|" +
                        ", login=" + login + "|" +
                        ", password=" + password + "|" +
                        ", admin=" + Boolean.toString(admin) + "|" +
                        "\n";
    }

    public User() {

    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamali() {
        return famali;
    }

    public void setFamali(String famali) {
        this.famali = famali;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
