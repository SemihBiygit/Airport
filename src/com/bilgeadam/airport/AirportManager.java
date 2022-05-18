package com.bilgeadam.airport;

import java.util.ArrayList;
import java.util.Scanner;

import com.bilgeadam.model.airport.Airport;
import com.bilgeadam.model.vehicle.Airplane;
import com.bilgeadam.model.vehicle.Helicopter;
import com.bilgeadam.model.vehicle.Vehicle;

public class AirportManager {
	private Airport airport;
	private ArrayList<Vehicle> vehicles;

	public AirportManager() {
		super();
		this.vehicles = new ArrayList<>();
	}

	public static void main(String[] args) {

		System.out.println("Airport Management App");
		AirportManager manager = new AirportManager();
		manager.airport = new Airport("Istanbul Airport", "Istanbul");
		System.out.println(manager.airport);
		System.out.println("Thanks for using the Airport Management App");
	}

	private void registerVehicles() {
		System.out.println("Please enter vehicle information :");
		Scanner in = new Scanner(System.in);
		boolean exit = false;
		Vehicle vehicle;
		while (!exit) {
			System.out.println("Please enter the vehicle type. (helicopter, airplane, fire truck, service ,exit) :");
			String type = in.nextLine();
			if (type.equalsIgnoreCase("exit")) {
				exit = true;
				continue;
			}
			System.out.println("Please enter the brand :");
			String brand = in.nextLine();
			System.out.println("Please enter the name :");
			String name = in.nextLine();
			System.out.println("Please enter the engine type :");
			String engineType = in.nextLine();

			if (type.equalsIgnoreCase("helicopter")) {
				vehicle = new Helicopter("brand", "enginetype");

			} else if (type.equalsIgnoreCase("airplane")) {
				System.out.println("Please enter the wing length :");
				int wingLength = in.nextInt();
				System.out.println("Please enter the weight :");
				int weight = in.nextInt();
				System.out.println("Please enter the max weight :");
				int maxWeight = in.nextInt();
				in.nextLine();
				vehicle = new Airplane(brand, engineType, wingLength, wingLength, wingLength);
			} else if (type.equalsIgnoreCase("firetruck")) {

			} else if (type.equalsIgnoreCase("service")) {

			}
		}
		in.close();
	}
}
