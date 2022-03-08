package com.pluralsight.conferencedemo.models;

import com.pluralsight.conferencedemo.repositories.SessionJpaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SessionTest {
    @Autowired
    private SessionJpaRepository jpaRepository;

    @Test
    public void test() throws Exception {
        List<Session> sessions = jpaRepository.findBySessionNameContains("Java");
        assertTrue(sessions.size() > 0);
    }

    @Test
    public void testJpaNot() throws Exception {
        List<Session> sessions = jpaRepository.findBySessionLengthNot(30);
        assertTrue(sessions.size() > 0);
    }

    @Test
    public void testJpaNotLike() throws Exception {
        List<Session> sessions = jpaRepository.findBySessionNameNotLike("Java%");
        assertTrue(sessions.size() > 0);
    }

    @Test
    public void testJpaStartingWithLetterA() throws Exception {
        List<Session> sessions = jpaRepository.findBySessionNameStartingWith("A");
        assertTrue(sessions.size() > 0);
    }

    @Test
    public void testJpaLessThan() throws Exception {
        List<Session> sessions = jpaRepository.findBySessionLengthLessThan(45);
        assertTrue(sessions.size() > 0);
    }
}
