package com.khauminhduy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.khauminhduy.service.SpeakerService;
import com.khauminhduy.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name = "speakerService")
	public SpeakerService getSpeakerService() {
		return new SpeakerServiceImpl();
	}

}
