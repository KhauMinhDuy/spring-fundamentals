package com.khauminhduy.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.khauminhduy.util.CalendarFactory;

@Configuration
@ComponentScan(basePackages = { "com.khauminhduy" })
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

	@Bean
	public CalendarFactory calendarFactory() {
		CalendarFactory calendarFactory = new CalendarFactory();
		calendarFactory.addDay(2);
		return calendarFactory;
	}

	@Bean
	public Calendar calendar() throws Exception {
		return calendarFactory().getObject();
	}

}
