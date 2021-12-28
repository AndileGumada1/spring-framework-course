package com.andile.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

    public static void main(String[] args) {

        //load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkouts());

        //call new methods on the fortunes
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();

    }
}
