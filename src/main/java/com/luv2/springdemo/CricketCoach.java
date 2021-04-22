package com.luv2.springdemo;

public class CricketCoach implements  caoch{
    private fortuneService fortuneService;
    private String email;
    private String team;

    public CricketCoach(){
        System.out.println("No-arg-constructor");
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    public String getTeam(){
        return team;
    }

    public void setFortuneService(fortuneService fortuneService){
        System.out.println("setter method");
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "practice fast for 15 hour";
    }

    @Override
    public String getDailyFortunes() {
        return fortuneService.getFortune();
    }
}
