package com.api.parking_control.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.api.parking_control.models.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
	public boolean existsByLicensePlateCar(String licensePlateCar);
	public boolean existsByParkingSpotNumber(String parkingSpotNumber);
	public boolean existsByApartmentAndBlock(String apartment, String block);
}
