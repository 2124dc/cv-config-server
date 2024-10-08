package com.app.config_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(ConfigServerApplication.class);
	public static void main(String[] args) {
		logger.info("Starting the Config Server application...");
        SpringApplication.run(ConfigServerApplication.class, args);
        logger.info("Config Server application started successfully.");
	}
}


