package com.narayanatutorial.SpringBootProfileExample;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@Profile("MarutiSuziki")
public class MarutiSuziki implements VehicleBrand {

	@Override
	public String getVehiclName() {
		// TODO Auto-generated method stub
		return "MarutiSuziki";
	}

}