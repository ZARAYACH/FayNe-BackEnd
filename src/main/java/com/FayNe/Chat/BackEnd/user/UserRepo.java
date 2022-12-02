package com.FayNe.Chat.BackEnd.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

    @Query(value = "SELECT u FROM User u where u.phoneNumber = :phoneNumber ")
    User getUserByPhoneNumber(String phoneNumber);

    @Query(value = "SELECT u FROM User u where u.id = :id")
    User getUserById(String id);
}
