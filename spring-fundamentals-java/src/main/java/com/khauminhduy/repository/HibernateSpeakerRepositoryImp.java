package com.khauminhduy.repository;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.khauminhduy.model.Speaker;

@Repository(value = "speakerRepository")
//@Profile("dev")
public class HibernateSpeakerRepositoryImp implements SpeakerRepository {

	@Autowired
	private Calendar calendar;

	@Value("#{T(java.lang.Math).random() * 100}")
	private double seedNum;

	@Override
	public List<Speaker> findAll() {
		System.out.println("cal: " + calendar.getTime());
		return Arrays.asList(new Speaker("Khau", "Duy", seedNum));
	}

}
