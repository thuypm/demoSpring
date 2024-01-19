package com.thuypm.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.thuypm.demo.enities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Object> {
    @Override
    List<User> findAll();

    @Query("SELECT t FROM User t WHERE t.username = ?1")
    User findUserByUsername(String username);

}
