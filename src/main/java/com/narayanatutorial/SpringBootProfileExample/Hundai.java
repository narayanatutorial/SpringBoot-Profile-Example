package com.narayanatutorial.SpringBootProfileExample;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@Profile("Hundai")
public class Hundai implements VehicleBrand {

	@Override
	public String getVehiclName() {
		// TODO Auto-generated method stub
		return "Hundai";
	}

}