package com.khauminhduy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.khauminhduy.config.AppConfig;
import com.khauminhduy.service.SpeakerService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);
		SpeakerService speakerService2 = applicationContext.getBean("speakerService", SpeakerService.class);
		
		System.out.println(speakerService);
		System.out.println(speakerService2);
		speakerService.findAll().forEach(System.out::println);
	}

}
