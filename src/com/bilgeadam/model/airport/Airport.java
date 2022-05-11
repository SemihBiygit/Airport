package com.bilgeadam.model.airport;

public class Airport {
	private String name;
	private String city;
	private BuildingPart runway;
	private BuildingPart taxiway1;
	private BuildingPart taxiway2;
	private BuildingPart apron;

	public Airport(String name, String city) {
		this.name = name;
		this.city = city;
		this.runway= new BuildingPart("Pist", "Asfalt", 2000, 50);
		this.taxiway1= new BuildingPart("Taksi 1", "Beton", 200, 25);
		this.taxiway2= new BuildingPart("Taksi 2", "Beton", 100, 25);
		this.apron= new BuildingPart("Apron", "Beton", 200, 300);
	}

	public BuildingPart getRunway() {
		return this.runway;
	}

	public void setRunway(BuildingPart runway) {
		this.runway = runway;
	}

	public BuildingPart getTaxiway1() {
		return this.taxiway1;
	}

	public void setTaxiway1(BuildingPart taxiway1) {
		this.taxiway1 = taxiway1;
	}

	public BuildingPart getTaxiway2() {
		return this.taxiway2;
	}

	public void setTaxiway2(BuildingPart taxiway2) {
		this.taxiway2 = taxiway2;
	}

	public BuildingPart getApron() {
		return this.apron;
	}

	public void setApron(BuildingPart apron) {
		this.apron = apron;
	}

	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}

	@Override
	public String toString() {
		return "Airport [name=" + this.name + ", city=" + this.city + ", runway=" + this.runway + ", taxiway1="
				+ this.taxiway1 + ", taxiway2=" + this.taxiway2 + ", apron=" + this.apron + "]";
	}

}
