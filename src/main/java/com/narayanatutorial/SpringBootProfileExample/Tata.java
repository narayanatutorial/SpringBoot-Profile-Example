package com.narayanatutorial.SpringBootProfileExample;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@Profile("Tata")
public class Tata implements VehicleBrand {

	@Override
	public String getVehiclName() {
		// TODO Auto-generated method stub
		return "Tata";
	}

}