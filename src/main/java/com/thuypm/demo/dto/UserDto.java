/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thuypm.demo.dto;

/**
 * @author THUY PHAM
 */
public class UserDto {
    private String username;

    public String getUsername() {
        return username;
    }

    public UserDto(String username, String user_id) {
        this.username = username;
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    private String user_id;
}
