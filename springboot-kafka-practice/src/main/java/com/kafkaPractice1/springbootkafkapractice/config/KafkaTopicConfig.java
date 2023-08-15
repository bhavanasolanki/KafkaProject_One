package com.kafkaPractice1.springbootkafkapractice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic javaGuidesTopic() {
		return TopicBuilder.name("javaGuides").build();
	}
	
	@Bean
	public NewTopic userJSONTopic() {
		return TopicBuilder.name("userJSON").build();
	}
	
	@Bean
	public NewTopic wikiTopic() {
		return TopicBuilder.name("wikimediaRecentChanges").build();
	}
}
