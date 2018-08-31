package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	// define a private field for the dependency 
	private FortuneService fortuneService; 
	
	// define a constructor for dependency injection 
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Method inside BaseballCoach";
	}


	@Override
	public String getDailyFortune() {

		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
