package com.luv2.springdemo;

public class TrackCoach implements caoch {
    private fortuneService fortuneService;
    public TrackCoach(fortuneService fortuneService) {
        fortuneService=fortuneService;
    }

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortunes() {
        return null;
    }
    public void doMyStartup(){
        System.out.println("startup");
    }
    public void doMyCleanup(){
        System.out.println("cleanup");
    }
}
