package com.FayNe.Chat.BackEnd.message;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;


@Data
@Builder
public class Message {

	private final String id = UUID.randomUUID().toString();

	private String content;

	private String senderId;

	private String channelId;

	private Instant date;
}
