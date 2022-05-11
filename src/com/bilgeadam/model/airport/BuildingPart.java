package com.bilgeadam.model.airport;

public class BuildingPart {
	private String name;
	private String material;
	private int length;
	private int width;

	public BuildingPart(String name, String material, int length, int width) {
		this.name = name;
		this.material = material;
		this.length = length;
		this.width = width;
	}

	public String getMaterial() {
		return this.material;
	}

	public int getLength() {
		return this.length;
	}

	public int getWidth() {
		return this.width;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "BuildingPart [name=" + this.name + ", material=" + this.material + ", length=" + this.length
				+ ", width=" + this.width + "]";
	}

}
