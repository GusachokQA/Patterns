package org.techmeskills.aqa5.auf.models;

import org.techmeskills.aqa5.auf.baseEntity.BaseTest;

public class User{
    private String username;
    private String password;

    public static class Builder{
        private User newUser;

        public Builder(){
            newUser = new User();
        }

        public Builder withUsername(String username){
            newUser.username = username;
            return this;
        }

        public Builder witPassword(String password){
            newUser.password = password;
            return this;
        }

        public User build(){
            return newUser;
        }
    }


/*
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
*/
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


}
