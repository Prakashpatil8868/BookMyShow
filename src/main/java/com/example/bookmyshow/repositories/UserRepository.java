package com.example.bookmyshow.repositories;


import com.example.bookmyshow.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByEmail(String emailId);
}
