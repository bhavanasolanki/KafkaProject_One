package com.kafkaPractice1.springbootkafkapractice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafkaPractice1.springbootkafkapractice.kafka.KafkaJSONProducer;
import com.kafkaPractice1.springbootkafkapractice.kafka.KafkaProducer;
import com.kafkaPractice1.springbootkafkapractice.payload.User;

@RestController
@RequestMapping("/kafkaRest/")
public class kafkaController {

	@Autowired
	private KafkaProducer kafkaProducer;

	@Autowired
	private KafkaJSONProducer kafkaJSONProducer;
	
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message){
		kafkaProducer.sendMessageToTopic(message);
		return ResponseEntity.ok("Msg published to topic");
	}
	
	@PostMapping("/publish")
	public ResponseEntity<String> publishJSON(@RequestBody User user){
		kafkaJSONProducer.sendMessageToTopic(user);
		return ResponseEntity.ok("JSON Msg published to topic");
	}
	
}
