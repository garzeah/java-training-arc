package garzeah;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        // Read spring config file
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(SportConfig.class);

        // Get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // Get popping bean
        // Coach poppingCoach = context.getBean("poppingCoach", Coach.class);

        // Call a method on the beans
        System.out.println(theCoach.getDailyWorkout());
        // System.out.println(poppingCoach.getDailyWorkout());

        // Call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // Close the context
        context.close();
    }
}
