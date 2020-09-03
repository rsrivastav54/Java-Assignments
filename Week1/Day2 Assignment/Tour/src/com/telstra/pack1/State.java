package com.telstra.pack1;

public class State {
	private String loc1;
	private String loc2;
	private String loc3;

	public State(String loc1, String loc2, String loc3) {
		super();
		this.loc1 = loc1;
		this.loc2 = loc2;
		this.loc3 = loc3;
	}

	public void getDestination(int dest) {
		switch (dest) {
		case 1:
			System.out.println("Welcome to " + loc1);
			break;
		case 2:
			System.out.println("Welcome to " + loc2);
			break;
		case 3:
			System.out.println("Welcome to " + loc3);
			break;
		default:
			System.out.println("No such destination exists");
		}
	}

	@Override
	public String toString() {
		return "State [loc1=" + loc1 + ", loc2=" + loc2 + ", loc3=" + loc3 + "]";
	}

}
