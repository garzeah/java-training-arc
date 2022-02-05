package garzeah;

import org.springframework.stereotype.Component;

@Component
public class PoppingCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Do 100 waves!!!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
