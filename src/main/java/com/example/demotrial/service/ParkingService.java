package com.example.demotrial.service;

import java.util.List;

import com.example.demotrial.entity.Mekina;
import com.example.demotrial.entity.Vehicle;
import com.example.demotrial.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingService
{
	@Autowired
	protected ParkingRepository parkingRepository;

	public List<Mekina> getMekina()
	{
		return parkingRepository.findAll();
	}

	public Mekina saveMekina()
	{
		Mekina mekina= new Mekina(2L,"test","Toyota");
//		mekina.setDescription("test");
		return parkingRepository.save(mekina);

	}
}
