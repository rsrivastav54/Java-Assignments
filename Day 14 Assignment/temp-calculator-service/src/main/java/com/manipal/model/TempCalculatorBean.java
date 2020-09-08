package com.manipal.model;

public class TempCalculatorBean {
	private String from;
	private String to;
	private double multiplier;
	private double adder;
	private double unit;
	private double calculatedValue;
	
	
	public TempCalculatorBean() {
		// TODO Auto-generated constructor stub
	}

	public TempCalculatorBean(String from, String to, double multiplier, double adder, double unit,
			double calculatedValue) {
		super();
		this.from = from;
		this.to = to;
		this.multiplier = multiplier;
		this.adder = adder;
		this.unit = unit;
		this.calculatedValue = calculatedValue;
	}

	public double getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}
	public double getAdder() {
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
	public double getUnit() {
		return unit;
	}
	public void setUnit(double unit) {
		this.unit = unit;
	}
	public double getCalculatedValue() {
		return calculatedValue;
	}
	public void setCalculatedValue(double calculatedValue) {
		this.calculatedValue = calculatedValue;
	}
	

}
