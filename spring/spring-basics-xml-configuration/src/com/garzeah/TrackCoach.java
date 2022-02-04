package com.garzeah;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    // Why do we have a no-arg constructor? (It's for MyApp)
    // When you don’t define any constructor in your class,
    // compiler defines default one for you, however when
    // you declare any constructor (in your example you have
    // already defined a parameterized constructor), compiler
    // doesn’t do it for you.

    // Since you have defined a constructor in class code, compiler
    // didn’t create default one. While creating object you are
    // invoking default one, which doesn’t exist in class code.
    // Then the code gives an compilation error.
    public TrackCoach() {}

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }
}
