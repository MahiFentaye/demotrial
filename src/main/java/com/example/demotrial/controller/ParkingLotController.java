package com.example.demotrial.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demotrial.entity.Mekina;
import com.example.demotrial.entity.Vehicle;
import com.example.demotrial.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/parking")
public class ParkingLotController
{
	private int nextSlot = 1;
	private  final Map<Integer, Vehicle>parkingLot = new HashMap<>();

	@Autowired
	ParkingService parkingService;

	@PostMapping("/park")
	public String parkVehicle(@RequestBody Vehicle vehicle) {
		if (nextSlot > 10) {
			return "Parking lot full!";
		}
		parkingLot.put(nextSlot, vehicle);
		return "Vehicle with registration number " + vehicle.getRegistrationNumber() + " parked at slot " + nextSlot++;
	}
	@PostMapping("/GetVehicles")
	public List<Mekina> getVehicles()
	{
		return parkingService.getMekina();
	}

	@PostMapping("/saveMekina")
	public Mekina saveMekina()
	{
		return parkingService.saveMekina();
	}
}
