package garzeah;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// Spring will automatically register this bean w/ the spring arg as an id
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

    // Field Injection
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // Define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // Setter injection
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println(">> TennisCoach: inside setFortuneService() method");
//        this.fortuneService = fortuneService;
//    }

    // Constructor Injection
    //    @Autowired
    //    public TennisCoach(FortuneService fortuneService) {
    //        this.fortuneService = fortuneService;
    //    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // Define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    // Define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }
}
