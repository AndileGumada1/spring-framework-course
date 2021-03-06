package com.andile.spring;

public class BaseballCoach implements Coach{


    //define a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }


    @Override
    public String getDailyWorkouts() {
        return"Spend 30 minutes in the ";
    }

    @Override
    public String getDailyFortune() {

        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
