package com.cab_book_driver_kafka.cab_book_driver_kafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.cab_book_driver_kafka.cab_book_driver_kafka.constants.CabBookDriverConstants;

@Service
public class Cabbookservice {
	@Autowired
	KafkaTemplate<String, Object> kafkaTemplate;
	
	public boolean updateDriverLocationValue(String location) {
		//sending message to kafka broker with topic and message
		kafkaTemplate.send(CabBookDriverConstants.DRIVER_LOCATION_TOPIC,location);
		return true;
	}
}
