package com.garzeah.repository;

import com.garzeah.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Andy");
        speaker.setLastName("Garcia");

        speakers.add(speaker);

        return speakers;
    }
}
