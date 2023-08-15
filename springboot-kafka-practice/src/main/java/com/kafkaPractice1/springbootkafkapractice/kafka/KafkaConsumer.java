package com.kafkaPractice1.springbootkafkapractice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafkaPractice1.springbootkafkapractice.payload.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics="javaGuides",groupId="myGroup")
	public void consumer(String msg) {
		// so this method becomes a subscriber of the kafka topic- javaGuides
		System.out.println("**********************");
		System.out.println(msg);
		System.out.println("**********************");
	}
	
	@KafkaListener(topics="userJSON",groupId="myGroup")
	public void JSONconsumer(User user) {
		// so this method becomes a subscriber of the kafka topic- javaGuides
		System.out.println("**********************");
		System.out.println(user);
		System.out.println("**********************");
	}
}
