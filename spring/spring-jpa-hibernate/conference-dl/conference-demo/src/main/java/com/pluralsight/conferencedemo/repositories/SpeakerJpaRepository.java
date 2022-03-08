package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpeakerJpaRepository extends JpaRepository<Speaker, Long> {
    // Query DSL for And, Or conditionals
    List<Speaker> findByFirstNameAndLastName(String firstName, String lastName);
    List<Speaker> findByFirstNameOrLastName(String firstName, String lastName);

    // Null Example
    List<Speaker> findBySpeakerPhotoIsNull();

    // In Example
    List<Speaker> findByCompanyIn(List<String> companies);

    // Ignore Example
    List<Speaker> findByCompanyIgnoreCase(String company);

    // Order By Example
    List<Speaker> findByLastNameOrderByFirstNameAsc(String lastName);

    Speaker findFirstByFirstName(String firstName);
}
