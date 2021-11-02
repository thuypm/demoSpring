package com.thuypm.demo.services;

import com.thuypm.demo.dto.UserDto;
import com.thuypm.demo.enities.User;
import com.thuypm.demo.repositories.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author THUY PHAM
 */
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getUsers() {
        return repository.findAll();
    }


    public User getUserByUsername(String username){
        return  repository.findUserByUsername(username);
    }
    public void checkUser()
    {
//        UserDto userFind = repository.findOne()
    }
}
