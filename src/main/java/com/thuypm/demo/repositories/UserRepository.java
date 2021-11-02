package com.thuypm.demo.repositories;

import com.thuypm.demo.enities.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    List<User> findAll();
}
