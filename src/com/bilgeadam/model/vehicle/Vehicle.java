package com.bilgeadam.model.vehicle;

public class Vehicle {
	private String brand;
	private String name;
	private String color;
	private String engineType;
	private int maxSpeed;

	public Vehicle(String brand, String engineType) {
		this.brand = brand;
		this.engineType = engineType;

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return this.brand;
	}

	public String getEngineType() {
		return this.engineType;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + this.brand + ", name=" + this.name + ", color=" + this.color + ", engineType="
				+ this.engineType + ", maxSpeed=" + this.maxSpeed + "]";
	}
}
