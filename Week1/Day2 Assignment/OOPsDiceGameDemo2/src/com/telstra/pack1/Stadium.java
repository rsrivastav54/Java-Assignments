package com.telstra.pack1;

public class Stadium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player p1 = new Player();
		Player p2 = new Player();

		int p1Score = p1.play();
		System.out.println("Number on die 1 : " + p1.getD1());
		System.out.println("Number on die 2 : " + p1.getD2());
		System.out.println("Total P1 score : " + p1Score);

		int p2Score = p2.play();
		System.out.println("Number on die 1 : " + p2.getD1());
		System.out.println("Number on die 2 : " + p2.getD2());
		System.out.println("Total P1 score : " + p2Score);

		if (p1Score > p2Score) {
			System.out.println("P1 won the game");
		} else if (p1Score == p2Score) {
			System.out.println("Tie");
		} else {
			System.out.println("P2 won the game");
		}
	}

}
