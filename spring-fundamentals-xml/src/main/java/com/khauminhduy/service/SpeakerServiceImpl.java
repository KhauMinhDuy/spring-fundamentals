package com.khauminhduy.service;

import java.util.List;

import com.khauminhduy.model.Speaker;
import com.khauminhduy.repository.HibernateSpeakerRepositoryImp;
import com.khauminhduy.repository.SpeakerRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImp();

	@Override
	public List<Speaker> findAll() {
		return speakerRepository.findAll();
	}

}
