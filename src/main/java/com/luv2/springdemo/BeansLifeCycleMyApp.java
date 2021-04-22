package com.luv2.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansLifeCycleMyApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifecycleApplicationContext.xml");
        caoch theCoach = context.getBean("myCoach",caoch.class);
        caoch alphaCoach = context.getBean("myCoach",caoch.class);
        System.out.println(theCoach.getDailyFortunes());
    }
}
