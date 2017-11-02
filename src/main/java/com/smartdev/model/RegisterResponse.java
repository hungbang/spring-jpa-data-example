package com.smartdev.model;

/**
 * Created by KAI on 11/2/17.
 */
public class RegisterResponse {

    private String username;
    private String role;

    public String getUsername() {
        return username;
    }

    public RegisterResponse setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getRole() {
        return role;
    }

    public RegisterResponse setRole(String role) {
        this.role = role;
        return this;
    }
}
