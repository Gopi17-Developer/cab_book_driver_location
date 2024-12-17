package com.cab_book_driver_kafka.cab_book_driver_kafka.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cab_book_driver_kafka.cab_book_driver_kafka.services.Cabbookservice;

@RestController
@RequestMapping("/driver-location")
public class Cabbookcontroller {

	@Autowired
	public Cabbookservice cabbookservice;
	
	@GetMapping("/get-location")
	public ResponseEntity updateDriverLocationValue() throws InterruptedException {
		
		int range = 100;
        while (range > 0) {
            cabbookservice.updateDriverLocationValue(Math.random()+" "+Math.random());
            Thread.sleep(1000);
            range --;
        }

        return new ResponseEntity<>(Map.of("message", "Location Updated")
        , HttpStatus.OK);
    
	}
}
