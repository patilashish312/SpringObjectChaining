package com.spr.boot3.ConditionalVerification.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spr.boot3.ConditionalVerification.Processor.MyProcessor;

import lombok.extern.slf4j.Slf4j;



@Slf4j
public class MyValidator {
	
	MyProcessor myProcessor;
	
	@Autowired
	public MyValidator(MyProcessor myProcessor) {
		this.myProcessor=myProcessor;
	}
	
	public void validating() {
		log.info("Printing processor bean {}",myProcessor);
		myProcessor.processing();
	}
}
