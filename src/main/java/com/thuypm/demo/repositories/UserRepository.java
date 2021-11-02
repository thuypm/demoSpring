package com.thuypm.demo.repositories;

import com.thuypm.demo.enities.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    List<User> findAll();

    @Query("SELECT t FROM User t WHERE t.username = ?1")
    User findUserByUsername(String username);
}
