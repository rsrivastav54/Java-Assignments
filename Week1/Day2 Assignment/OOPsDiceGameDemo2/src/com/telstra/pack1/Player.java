package com.telstra.pack1;

public class Player {

	// How to encapsulate the data members and how can you bind the members with
	// methods
	private Dice d1;
	private Dice d2;
	private int roll1;
	private int roll2;

	public Player() {
		super();
		d1 = new Dice();
		d2 = new Dice();
	}

	public int play() {
		roll1 = d1.roll();
		roll2 = d2.roll();
		return (roll1 + roll2); // returns added value of both dice
	}

	public int getD1() { // Getters return the information of member variables
						 // of the class object if necessary
		return roll1;
	}

	public int getD2() {
		return roll2;
	}

}
