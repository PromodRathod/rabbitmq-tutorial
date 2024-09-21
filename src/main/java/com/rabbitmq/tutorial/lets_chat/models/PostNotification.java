package com.rabbitmq.tutorial.lets_chat.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PostNotification {

	private String postId;
	private String userId;
}
