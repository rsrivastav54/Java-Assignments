package com.manipal.model;

public class ConversionRate {
	private String from;
	private String to;
	private double multiplier;
	private double adder;

	public ConversionRate() {

	}

	public ConversionRate(String from, String to) {
		super();
		this.from = from;
		this.to = to;
		this.multiplier = getMultiplier();
		this.adder = getAdder();
	}

	public double getMultiplier() {
		if ((from.equals("C")) && (to.equals("F"))) {
			multiplier = 1.8;
		}
		if ((from.equals("F")) && (to.equals("C"))) {
			multiplier = 0.5555;
		}
		return multiplier;
	}

	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}

	public double getAdder() {
		if ((from.equals("C")) && (to.equals("F"))) {
			adder = 32;
		}
		if ((from.equals("F")) && (to.equals("C"))) {
			adder = -17.776;
		}
		return adder;
	}

	public void setAdder(double adder) {
		this.adder = adder;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

}
