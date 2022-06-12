package com.khauminhduy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.khauminhduy.repository.HibernateSpeakerRepositoryImp;
import com.khauminhduy.repository.SpeakerRepository;
import com.khauminhduy.service.SpeakerService;
import com.khauminhduy.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name = "speakerService")
	public SpeakerService getSpeakerService() {
		SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
		speakerService.setSpeakerRepository(getSpeakerRepository());
		return speakerService;
	}

	@Bean
	public SpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImp();
	}

}
