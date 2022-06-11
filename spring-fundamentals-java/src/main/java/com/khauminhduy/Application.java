package com.khauminhduy;

import com.khauminhduy.service.SpeakerService;
import com.khauminhduy.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		SpeakerService speakerService = new SpeakerServiceImpl();
		speakerService.findAll().forEach(System.out::println);
	}

}
