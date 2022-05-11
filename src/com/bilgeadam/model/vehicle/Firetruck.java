package com.bilgeadam.model.vehicle;

public class Firetruck extends LandVehicle {
	private double waterCapacity;
	private boolean onDuty;

	public Firetruck(String brand, String engineType, double waterCapacity) {
		super(brand, engineType);
		this.waterCapacity = waterCapacity;
		this.onDuty = false;
	}

	public boolean isOnDuty() {
		return this.onDuty;
	}

	public void setOnDuty(boolean onDuty) {
		this.onDuty = onDuty;
	}

	public double getWaterCapacity() {
		return this.waterCapacity;
	}

}
