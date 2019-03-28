package com.bluedart.location.services;

import java.util.List;


import com.bluedart.location.entity.Location;

public interface LocationServices {

	Location addLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(int id);

	List<Location> getAllLocation();
}
