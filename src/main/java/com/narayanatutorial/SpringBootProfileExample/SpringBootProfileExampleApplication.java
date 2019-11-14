package com.narayanatutorial.SpringBootProfileExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringBootProfileExampleApplication implements CommandLineRunner{

	@Autowired
	VehicleBrand vehicleBrand;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfileExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String vehicaleName=vehicleBrand.getVehiclName();
		System.out.println("Vehical Name:"+vehicaleName);
	}

}
