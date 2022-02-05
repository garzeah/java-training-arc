package com.garzeah;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // Load the spring configuration file
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from spring container
        // Why do we use CricketCoach class instead of Coach Interface?

        // When you retrieve a bean from the Spring container using the Coach interface:
        // You only have access to the methods defined in the Coach interface:
        // getDailyWorkout and getDailyFortune. Even though the actual implementation
        // has additional methods, you only have visibility to methods that are defined
        // at the Coach interface level.

        // When you retrieve a bean from the Spring container using the CricketCoach class:
        // You have access to the methods defined in the Coach interface: getDailyWorkout and getDailyFortune.
        // ALSO, you have access to the additional methods defined in the CricketCoach class: getTeam, setTeam.

        // The bottom line is it depends on how you retrieve the object and assign it ... that determines the
        // visibility you have to the methods.
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // Call methods to get the literval values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // Close the context
        context.close();
    }
}
