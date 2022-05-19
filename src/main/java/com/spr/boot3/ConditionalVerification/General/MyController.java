package com.spr.boot3.ConditionalVerification.General;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spr.boot3.ConditionalVerification.Handler.MyHandler;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MyController {

	@Autowired
	ApplicationContext applicationContext;

	@PostMapping(value = "/postRequest")
	public void postRequest(@RequestBody MyRequest myRequest) {
		log.info("displaying request {}", myRequest);
		MyHandler handler = null;
		if (myRequest.getRequestType().equalsIgnoreCase("requestTypeA")) {
			handler = (MyHandler) applicationContext.getBean("handlerA");
		} else {
			handler = (MyHandler) applicationContext.getBean("handlerB");
		}
		log.info("Printing handler bean {}",handler);
		handler.handling();
	}


}
