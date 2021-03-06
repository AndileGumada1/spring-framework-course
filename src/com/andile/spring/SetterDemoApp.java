package com.andile.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkouts());
        System.out.println(theCoach.getDailyFortune());

        //call new methods
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        //close the context
        context.close();
    }
}
