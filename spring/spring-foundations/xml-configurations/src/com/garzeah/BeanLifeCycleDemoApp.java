package com.garzeah;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        // Loading the spring configuration file
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyFortune());

        // Close the context
        context.close();
    }
}
