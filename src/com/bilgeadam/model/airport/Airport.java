package com.bilgeadam.model.airport;

import java.util.Arrays;

public class Airport {
	private String name;
	private String city;
	private BuildingPart[] parts;

	public Airport(String name, String city) {
		this.name = name;
		this.city = city;

		this.parts = new BuildingPart[5];
		this.buildAirpott();
	}

	private void buildAirpott() {

		this.parts[0] = new BuildingPart("Pist", "Asfalt", 2000, 50, Part.RUNWAY);
		this.parts[1] = new BuildingPart("Taksi 1", "Beton", 200, 25, Part.TAXI);
		this.parts[2] = new BuildingPart("Taksi 2", "Beton", 100, 25, Part.TAXI);
		this.parts[3] = new BuildingPart("Taksi 3", "Beton", 150, 25, Part.TAXI);
		this.parts[4] = new BuildingPart("Apron", "Beton", 200, 300, Part.APRON);
	}

	public BuildingPart[] getParts() {
		return this.parts;
	}

	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}

	@Override
	public String toString() {
		return "Airport [name=" + this.name + ", city=" + this.city + ", parts=" + Arrays.toString(this.parts) + "]";
	}

}
