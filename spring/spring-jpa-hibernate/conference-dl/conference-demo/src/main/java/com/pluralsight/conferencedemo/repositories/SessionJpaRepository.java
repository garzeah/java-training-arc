package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SessionJpaRepository extends JpaRepository<Session, Long> {
    List<Session> findBySessionNameContains(String name); // Query DSL returns collection
    Session findFirstBySessionNameContains(String name); // Query DSL returns first row
    Long countBySessionNameContains(String name); // Query DSL returns the count
}
