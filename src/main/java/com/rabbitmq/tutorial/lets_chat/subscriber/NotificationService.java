package com.rabbitmq.tutorial.lets_chat.subscriber;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.rabbitmq.tutorial.lets_chat.constants.LetsChatConstants;
import com.rabbitmq.tutorial.lets_chat.models.PostNotification;

@Service
public class NotificationService {

	@RabbitListener(queues = LetsChatConstants.QUEUE)
	public void consumeMessageForQueue(PostNotification postNotificationModel) {
		System.out.println("received message from the queue is : " + postNotificationModel.toString());
	}
}
