package com.khauminhduy.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.khauminhduy.model.Speaker;

@Repository(value = "speakerRepository")
public class HibernateSpeakerRepositoryImp implements SpeakerRepository {

	@Override
	public List<Speaker> findAll() {
		return Arrays.asList(new Speaker("Khau", "Duy"));
	}
	
}
