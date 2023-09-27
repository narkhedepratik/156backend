package com.bitlogic.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	final Marker FATAL=MarkerFactory.getMarker("FATAL");
	Logger log=LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/home")
	public String getLogs() {
		
		log.error("This is error log..!");
		log.info("This is info log..!");
		log.debug("This us debug log...!");
		log.trace("This is trace log..!");
	    log.info(FATAL,"This is fatal log..!"); 
		return "Hello";
	}

}
