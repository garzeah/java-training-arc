package garzeah;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // Read spring config file
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(SportConfig.class);

        // Get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // Call a method on the beans
        System.out.println(theCoach.getDailyWorkout());
        // System.out.println(poppingCoach.getDailyWorkout());

        // Call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // Call our new swim coach methods ... has the property values injected
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());

        // Close the context
        context.close();
    }
}
