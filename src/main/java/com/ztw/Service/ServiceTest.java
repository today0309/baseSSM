package com.ztw.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest {
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void test(){
		logger.info("############执行Main方法。。。############");
	}

}
