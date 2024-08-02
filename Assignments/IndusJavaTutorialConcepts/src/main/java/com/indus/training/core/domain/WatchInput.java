package com.indus.training.core.domain;

public class WatchInput {

	private String brand;
	private String model;
	private int year;

	/**
	 * Constructor for watch input
	 * @param brand
	 * @param model
	 * @param year
	 */
	public WatchInput(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}
}
