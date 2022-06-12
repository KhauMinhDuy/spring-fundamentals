package com.khauminhduy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.khauminhduy"})
public class AppConfig {

//	@Bean(name = "speakerService")
//	@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
//	public SpeakerService getSpeakerService() {
//		SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
////		speakerService.setSpeakerRepository(getSpeakerRepository());
//		return speakerService;
//	}
//
//	@Bean
//	public SpeakerRepository getSpeakerRepository() {
//		return new HibernateSpeakerRepositoryImp();
//	}

}
