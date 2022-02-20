package com.garzeah.service;

import com.garzeah.model.Speaker;
import com.garzeah.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
       return repository.findAll();
    };

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
