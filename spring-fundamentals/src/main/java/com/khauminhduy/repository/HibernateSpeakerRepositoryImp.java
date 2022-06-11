package com.khauminhduy.repository;

import java.util.Arrays;
import java.util.List;

import com.khauminhduy.model.Speaker;

public class HibernateSpeakerRepositoryImp implements SpeakerRepository {

	@Override
	public List<Speaker> findAll() {
		return Arrays.asList(new Speaker("Khau", "Duy"));
	}
	
}
