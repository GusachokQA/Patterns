package org.techmeskills.aqa5.auf.models;

public class User {
    private String username;
    private String password;

    public User(String userName, String password) {
        this.username = userName;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
