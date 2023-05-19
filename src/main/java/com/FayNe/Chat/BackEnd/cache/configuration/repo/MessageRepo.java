package com.FayNe.Chat.BackEnd.cache.configuration.repo;

import com.FayNe.Chat.BackEnd.message.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends CrudRepository<Message, String> {

}