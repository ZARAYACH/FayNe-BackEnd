package com.FayNe.Chat.BackEnd.message;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping({"/ws/chat"})
    @SendTo("/ws/rec")
    public String messages(Message message) {
        return message.getContent();
    }
}
