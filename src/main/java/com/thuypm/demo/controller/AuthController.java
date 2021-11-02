/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thuypm.demo.controller;

import com.thuypm.demo.enities.User;
import com.thuypm.demo.services.UserService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author THUY PHAM
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public List<User> getUserList() {
        return this.service.getUsers();
    }
}
