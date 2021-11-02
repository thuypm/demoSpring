/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thuypm.demo.enities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author THUY PHAM
 */
@Entity
@Table(name = "my_user", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"user_id"})}
)
public class User {

    public User() {

    }

    private String username;
    private Integer user_id;
    private String pass_word;

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Id
    @Column(name = "user_id")
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Column(name = "pass_word")
    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }

    public User(Integer user_id, String username, String pass_word) {
        this.user_id = user_id;
        this.username = username;
        this.pass_word = pass_word;
    }
}
