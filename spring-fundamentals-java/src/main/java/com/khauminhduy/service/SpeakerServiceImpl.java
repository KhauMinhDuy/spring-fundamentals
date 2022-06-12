package com.khauminhduy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khauminhduy.model.Speaker;
import com.khauminhduy.repository.SpeakerRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Service(value = "speakerService")
public class SpeakerServiceImpl implements SpeakerService {

	@Autowired
	private SpeakerRepository speakerRepository;

	@Override
	public List<Speaker> findAll() {
		return speakerRepository.findAll();
	}

}
