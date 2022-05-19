package com.spr.boot3.ConditionalVerification.General;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spr.boot3.ConditionalVerification.Dao.MyDao;
import com.spr.boot3.ConditionalVerification.Handler.MyHandler;
import com.spr.boot3.ConditionalVerification.Processor.MyProcessor;
import com.spr.boot3.ConditionalVerification.Validator.MyValidator;

@Configuration
public class MyAConfiguration {

	@Autowired
	ApplicationContext applicationContext;

	@Bean
	public MyHandler handlerA() {
		return new MyHandler((MyValidator) applicationContext.getBean("validatorA"));
	}

	@Bean
	public MyValidator validatorA() {
		return new MyValidator((MyProcessor) applicationContext.getBean("processA"));
	}

	@Bean
	public MyDao daoA() {
		return new MyDao();
	}

	@Bean
	public MyProcessor processA() {
		return new MyProcessor((MyDao) applicationContext.getBean("daoA"));
	}
}
