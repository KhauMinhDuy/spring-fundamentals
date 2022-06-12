package com.khauminhduy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.khauminhduy.config.AppConfig;
import com.khauminhduy.service.SpeakerService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);
		speakerService.findAll().forEach(System.out::println);
	}

}
