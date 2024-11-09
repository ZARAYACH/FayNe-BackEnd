package com.FayNe.Chat.BackEnd.message;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@RedisHash("Message")
public class Message {

	private final String id = UUID.randomUUID().toString();
	private String content;
	private String senderId;
	private String channelId;
	private Instant date;
}
