package com.example.tryui2;

public abstract class Person {
    protected String username;
    protected String password;
    protected String name;

    Person(String Username, String Password){
        this.username=Username;
        this.password=Password;
    }
    String getUsername(){
        return username;
    }
    String getPassword(){
        return password;
    }
}