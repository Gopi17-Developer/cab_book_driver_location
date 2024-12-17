package com.cab_book_driver_kafka.cab_book_driver_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

import com.cab_book_driver_kafka.cab_book_driver_kafka.constants.CabBookDriverConstants;

@Component
@Configuration
public class KafkaConfig {
	
	//creating kafka topic with default configurations
	@Bean
	public NewTopic topic() {
		return TopicBuilder
				.name(CabBookDriverConstants.DRIVER_LOCATION_TOPIC)
				.build();
	}
}
