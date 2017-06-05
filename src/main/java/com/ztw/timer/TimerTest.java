package com.ztw.timer;

import java.util.Date;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimerTest {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Scheduled(cron = "* * * * * ?")
	public void run() throws Exception {
		try {
			Thread.sleep(2 * 60 * 1000);
			logger.info(new Date() + "-》" + Thread.currentThread().getName() + "运行中");
		} catch (Exception e) {
			logger.info(e.toString());
		}
	}

}
