/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thuypm.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thuypm.demo.services.UserService;

/**
 * @author THUY PHAM
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService service;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    // @RequestMapping(value = "/user", method = RequestMethod.GET)
    // public String getUserList() {
    // System.out.println(" đã vào đây ");
    // return "{}";
    // }

}
