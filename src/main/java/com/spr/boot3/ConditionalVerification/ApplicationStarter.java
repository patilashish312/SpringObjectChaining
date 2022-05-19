package com.spr.boot3.ConditionalVerification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringBootApplication
public class ApplicationStarter {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStarter.class, args);
		log.info("Testing");
	}
}
