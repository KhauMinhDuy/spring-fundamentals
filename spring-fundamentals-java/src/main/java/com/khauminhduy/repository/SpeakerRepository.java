package com.khauminhduy.repository;

import java.util.List;

import com.khauminhduy.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}