package com.example.demotrial.repository;

import com.example.demotrial.entity.Mekina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<Mekina, Long>
{
}
