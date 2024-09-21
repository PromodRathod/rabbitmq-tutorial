package com.rabbitmq.tutorial.lets_chat.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbitmq.tutorial.lets_chat.constants.LetsChatConstants;
import com.rabbitmq.tutorial.lets_chat.models.PostNotification;

@Service
public class UploadPostService {

	@Autowired
	private RabbitTemplate publisherTemplate;
	
	public void uploadPostForUser(String userId, String postId) {
		publisherTemplate.convertAndSend(LetsChatConstants.EXHANGE, LetsChatConstants.ROUTING_KEY, new PostNotification(postId, userId));
		System.out.println("Successfully published uploadPost Notification from UploadPost !!!");
	}
}
