package com.luv2.springdemo;

public class HappyFortuneService implements fortuneService{
    @Override
    public String getFortune() {
        return "today is your lucky day ";
    }
}
