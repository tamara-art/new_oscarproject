package com.telran.project.utils;

public class User {
    String email;
    String pwd;


    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    public User(String email, String pwd) {
        this.email = email;
        this.pwd = pwd;
    }
}
