package com.smartdev.model;

import com.smartdev.entity.CustomGroup;

/**
 * Created by KAI on 11/2/17.
 */
public class RegisterParam {

    private String userName;

    private String password;
    private String group;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
