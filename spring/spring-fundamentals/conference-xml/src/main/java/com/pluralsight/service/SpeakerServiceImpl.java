package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    // Constructor Injection
    public SpeakerServiceImpl() {}

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    // Setter Injection
    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
