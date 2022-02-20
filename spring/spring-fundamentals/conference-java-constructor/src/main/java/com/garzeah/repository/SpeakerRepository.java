package com.garzeah.repository;

import com.garzeah.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
