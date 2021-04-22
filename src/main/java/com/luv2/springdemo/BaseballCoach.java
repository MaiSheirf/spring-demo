package com.luv2.springdemo;

public class BaseballCoach implements caoch{
    //define a private field for dependency
    private fortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(fortuneService theFortuneService){
        fortuneService = theFortuneService;

    }
    @Override
    public String getDailyWorkout(){
        return "spend 30 minutes on batting practice ";
    }

    @Override
    public String getDailyFortunes() {
        // use my fortuneservice to get a fortune
        return fortuneService.getFortune();
    }
}
