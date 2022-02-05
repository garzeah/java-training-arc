package com.garzeah;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // Loading the spring configuration file
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // Check if they are the same whenever we use singleton or prototype scope
        boolean result = (theCoach == alphaCoach);

        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        // Close the context
        context.close();
    }
}
