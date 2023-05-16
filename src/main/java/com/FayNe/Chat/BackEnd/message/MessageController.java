package com.FayNe.Chat.BackEnd.message;

import com.FayNe.Chat.BackEnd.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MessageController {

	private final SimpMessagingTemplate simpMessagingTemplate;

	@MessageMapping({"/chat"})
	public void messages(Message message) {
		message.setSenderId("1");
		simpMessagingTemplate.convertAndSendToUser(message.getSenderId(),
				"/queue/messages",
				message.getContent());
	}
}
