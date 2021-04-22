package com.luv2.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args){

        //load configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from container
        caoch thecoach = context.getBean("myCricketCoach",caoch.class);
        //call methods on bean
        System.out.println(thecoach.getDailyWorkout());
        System.out.println(thecoach.getDailyFortunes());
        //call methods in setter inject by creating cricketcaoch instead of coach
        //close context

    }
}
