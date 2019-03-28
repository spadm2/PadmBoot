package com.bluedart.location.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluedart.location.entity.Location;
import com.bluedart.location.repository.LocationRepository;

@Service
public class LocationServicesImpl implements LocationServices {
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public Location addLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return locationRepository.saveAndFlush(location);
	}

	@Override
	public void deleteLocation(Location location) {
		locationRepository.delete(location);
	}

	@Override
	public Location getLocationById(int id) {

		return locationRepository.getOne(id);
	}

	@Override
	public List<Location> getAllLocation() {
		return locationRepository.findAll();
	}

	public LocationRepository getLocationRepository() {
		return locationRepository;
	}

	public void setLocationRepository(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

}
