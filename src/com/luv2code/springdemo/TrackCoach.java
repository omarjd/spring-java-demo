package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
		
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	

	public TrackCoach() {
		
	}


	@Override
	public String getDailyWorkout() {
		
		return "Method inside Track Coach";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
