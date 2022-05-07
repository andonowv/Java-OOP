package com.example.demo.models;

public class User {
    private String name;
    private int age;
    private String mail;

    public User(String name, int age, String mail) {
        this.setName(name);
        this.setAge(age);
        this.setMail(mail);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
