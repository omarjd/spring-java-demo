package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	public CricketCoach() {
		System.out.println("Cricket Coach: inside no-arg constructor");
	}
	
	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter methode");
		this.fortuneService = fortuneService;
	}

	


	public String getEmailAddress() {
		return emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	public void setTeam(String team) {
		this.team = team;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Method inside Cricket Coach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
