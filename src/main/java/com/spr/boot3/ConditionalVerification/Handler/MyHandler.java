package com.spr.boot3.ConditionalVerification.Handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spr.boot3.ConditionalVerification.Validator.MyValidator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyHandler {

	private MyValidator myValidator;

	@Autowired
	public MyHandler(MyValidator myValidator) {
		this.myValidator = myValidator;
	}

	public void handling() {
		
		log.info("Printing validator bean {}", myValidator);
		myValidator.validating();
	}

}
