package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		String[] ster= {"One","Two","Three"};
		
		int rnd = new Random().nextInt(ster.length);
		
		return ster[rnd];
	}

}
