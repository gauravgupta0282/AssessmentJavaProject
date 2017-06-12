package com.rabbit.consulting;

import java.util.Queue;
import java.util.Random;

public class Randomizer {

	public int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(1000);
	}
	
	

}
