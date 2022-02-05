package com.garzeah;

public class PoppingCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "1000 arm waves";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
