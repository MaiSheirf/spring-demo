package com.luv2.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansDemoMyApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scopeApplicationContext.xml");
        caoch theCoach = context.getBean("myCoach",caoch.class);
        caoch alphaCoach = context.getBean("myCoach",caoch.class);
    }
}
