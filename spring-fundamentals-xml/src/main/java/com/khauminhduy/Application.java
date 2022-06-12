package com.khauminhduy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.khauminhduy.service.SpeakerService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);
		speakerService.findAll().forEach(System.out::println);
	}

}
