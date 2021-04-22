package com.luv2.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[]args){
        //load spring configuration file (xml)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retreive bean from spring container
        caoch thecoach = context.getBean("myCoach",caoch.class);
        //call methods on the bean
        System.out.println(thecoach.getDailyWorkout());

        //call dependency method
        System.out.println(thecoach.getDailyFortunes());
        //close the context
        context.close();
    }
}
