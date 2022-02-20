package com.garzeah.repository;

import com.garzeah.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository") // Setting this up as a bean
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
