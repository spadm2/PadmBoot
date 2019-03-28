package com.bluedart.location.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluedart.location.entity.Location;
import com.bluedart.location.repository.LocationRepository;

@RestController
@RequestMapping("/location")
public class LocationRestController {
	@Autowired
	private LocationRepository locationRepository;

	@GetMapping
	public List<Location> getLocations() {
		return locationRepository.findAll();
	}

	@PostMapping
	public Location addLocation(@RequestBody Location location) {
		return locationRepository.save(location);
	}

	@PutMapping
	public Location updateLocation(@RequestBody Location location) {
		return locationRepository.save(location);
	}
	@DeleteMapping("/{id}")
	public void removeLocation(@PathVariable("id") int id) {
		locationRepository.deleteById(id);
	}
	@GetMapping("/{id}")
	public Optional<Location> getLocationById(@PathVariable("id") int id) {
		
		return locationRepository.findById(id);
	}
}
