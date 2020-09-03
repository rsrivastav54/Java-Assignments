package com.telstra.pack1;

public class Baby {
	private double weight;
	private double height;
	private double BMI;

	public Baby(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
		this.BMI = calcHealth();
	}

	public double calcHealth() {	// return strings instead of print statements
		double bmi = weight / (Math.pow(height, 2));
		if (bmi < 18.5) {
			System.out.println("Undernourished");
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Healthy");
		} else {
			System.out.println("Overnourished");
		}
		return bmi;
	}

	@Override
	public String toString() {
		return "Baby [weight=" + weight + ", height=" + height + ", BMI=" + BMI + "]";
	}

}
