package com.bilgeadam.model.vehicle;

public class ServiceCar extends LandVehicle {
	private String serviceType;
	private boolean onDuty;

	public ServiceCar(String brand, String engineType, String serviceType) {
		super(brand, engineType);
		this.serviceType = serviceType;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public boolean isOnDuty() {
		return this.onDuty;
	}

	public void setOnDuty(boolean onDuty) {
		this.onDuty = onDuty;
	}
}
