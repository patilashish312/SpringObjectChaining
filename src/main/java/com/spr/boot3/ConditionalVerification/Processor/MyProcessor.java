package com.spr.boot3.ConditionalVerification.Processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spr.boot3.ConditionalVerification.Dao.MyDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyProcessor {

	private MyDao dao;

	@Autowired
	public MyProcessor(MyDao dao) {
		this.dao = dao;
	}

	public void processing() {
		log.info("Printing dao bean {}", dao);
		dao.daoOperation();
	}

}
