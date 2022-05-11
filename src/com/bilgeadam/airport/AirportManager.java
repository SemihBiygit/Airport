package com.bilgeadam.airport;

import com.bilgeadam.model.airport.Airport;

public class AirportManager {
	private Airport airport;

	public static void main(String[] args) {

		System.out.println("Havaalanı Yönetim Uygulaması");
		AirportManager manager = new AirportManager();
		manager.airport = new Airport("İstanbul Airport", "İstanbul");
		System.out.println(manager.airport);
		System.out.println("Havaalanı Yönetim Uygulamasını kullandığınız için teşekkürler");
	}

}
