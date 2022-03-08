package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Session;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SessionJpaRepository extends JpaRepository<Session, Long>, SessionCustomJpaRepository {
    List<Session> findBySessionNameContains(String name); // Query DSL returns collection
    Session findFirstBySessionNameContains(String name); // Query DSL returns first row
    Long countBySessionNameContains(String name); // Query DSL returns the count

    // Query DSL that can be substituted equals, is, or not
    List<Session> findBySessionLengthNot(Integer sessionLength);

    List<Session> findBySessionNameNotLike(String name);
    List<Session> findBySessionNameStartingWith(String name);

    // Operators example
    List<Session> findBySessionLengthLessThan(Integer sessionLength);

    @Query("select s from Session s where s.sessionName like %:name")
    Page<Session> getSessionWithName(@Param("name") String name, Pageable page);
}
