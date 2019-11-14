package com.narayanatutorial.SpringBootProfileExample;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Honda")
public class Honda implements VehicleBrand {

	@Override
	public String getVehiclName() {
		// TODO Auto-generated method stub
		return "Honda";
	}

}
