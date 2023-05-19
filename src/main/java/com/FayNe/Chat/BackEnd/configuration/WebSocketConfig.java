package com.FayNe.Chat.BackEnd.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Configuration
public class WebSocketConfig extends TextWebSocketHandler {

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("established");
		super.afterConnectionEstablished(session);

	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		System.out.println("closed");
		super.afterConnectionClosed(session, status);

	}

}
