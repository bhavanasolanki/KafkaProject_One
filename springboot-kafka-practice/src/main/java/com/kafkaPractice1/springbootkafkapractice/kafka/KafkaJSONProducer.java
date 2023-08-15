package com.kafkaPractice1.springbootkafkapractice.kafka;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.kafkaPractice1.springbootkafkapractice.payload.User;

@Service
public class KafkaJSONProducer {

	private KafkaTemplate<String,User> kafkaTemplate;

	public KafkaJSONProducer(KafkaTemplate<String, User> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessageToTopic(User user) {
		System.out.println("JSON msg published!");
		Message<User> msg=MessageBuilder.withPayload(user).setHeader(KafkaHeaders.TOPIC, "userJSON").build();
		kafkaTemplate.send(msg);
		System.out.println("JSON msg published!");
	}
}
