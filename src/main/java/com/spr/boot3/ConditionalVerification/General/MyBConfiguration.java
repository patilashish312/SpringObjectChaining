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
public class MyBConfiguration {

	@Autowired
	ApplicationContext applicationContext;

	@Bean
	public MyHandler handlerB() {
		return new MyHandler((MyValidator)applicationContext.getBean("validatorB"));
	}

	@Bean
	public MyValidator validatorB() {
		return new MyValidator((MyProcessor)applicationContext.getBean("processB"));
	}

	@Bean
	public MyDao daoB() {
		return new MyDao();
	}

	@Bean
	public MyProcessor processB() {
		return new MyProcessor((MyDao)applicationContext.getBean("daoB"));
	}
}
