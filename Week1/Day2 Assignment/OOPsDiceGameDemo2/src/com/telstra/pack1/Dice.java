package com.telstra.pack1;

import java.util.Random;

public class Dice {
	// private faceValue;
	// private noOfRolls;

	public int roll() {
		Random rand = new Random(); // for generating random nos. b/w 1-6

		return ((int) rand.nextInt(5) + 1); // difference and start value as parameters

	}

}
