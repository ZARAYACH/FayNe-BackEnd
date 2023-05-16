package com.FayNe.Chat.BackEnd.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

    @Query(value = "FROM user u where u.phoneNumber = :phoneNumber ")
    User getUserByPhoneNumber(String phoneNumber);

    User getUserById(String id);
}
