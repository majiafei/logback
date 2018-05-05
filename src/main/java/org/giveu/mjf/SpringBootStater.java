package org.giveu.mjf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootStater {
	
	private static final  Logger LOGGER = LoggerFactory.getLogger(SpringBootStater.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStater.class, args);
		LOGGER.info("SpringBootStater run success!");
	}
	
	@RequestMapping("/hello")
	public String hello(){
		LOGGER.info("hello");
		LOGGER.debug("debug=====");
		LOGGER.error("error");
		return "OK";
	}

}
