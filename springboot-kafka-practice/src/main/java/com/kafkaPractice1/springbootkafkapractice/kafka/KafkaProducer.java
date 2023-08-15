package com.kafkaPractice1.springbootkafkapractice.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	private KafkaTemplate<String,String> kafkaTemplate;

	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessageToTopic(String msg) {
		kafkaTemplate.send("javaGuides", msg);
		System.out.println("Message send to kafka topic-"+msg);
	}
	
}
