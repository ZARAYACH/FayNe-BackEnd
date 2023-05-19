package com.FayNe.Chat.BackEnd.message;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MessageController {
	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;

	@MessageMapping({"/chat"})
	public void messages(Message message) {
//		message.setSenderId("4");
//		simpMessagingTemplate.convertAndSendToUser(message.getSenderId(),
//				"/queue/messages",
//				message.getContent());
	}
}
