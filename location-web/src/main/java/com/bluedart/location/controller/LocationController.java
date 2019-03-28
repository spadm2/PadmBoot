package com.bluedart.location.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bluedart.location.entity.Location;
import com.bluedart.location.repository.LocationRepository;
import com.bluedart.location.services.LocationServices;
import com.bluedart.location.util.EmailUtil;
import com.bluedart.location.util.ReportUtil;

@Controller
public class LocationController {
	@Autowired
	private LocationServices locationService;
	@Autowired
	private EmailUtil emailUtil;
	@Autowired
	private LocationRepository repository;
	@Autowired
	private ReportUtil report;
	@Autowired
	private ServletContext servletContext;

	@RequestMapping("/show-page")
	public String randerPage() {
		return "create-location";
	}

	@RequestMapping("/add-location")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap model) {
		Location addLocation;
		addLocation = locationService.addLocation(location);
		String message = addLocation.getId() + " has Added";
		emailUtil.sendMail("nksamal91@gmail.com", location.getName() + " has saved",
				"location id:" + location.getId() + " and it's a " + location.getType());
		model.addAttribute("message", message);
		return "create-location";
	}

	@RequestMapping("/show-locations")
	public String showAllLocation(ModelMap map) {
		List<Location> allLocation = locationService.getAllLocation();
		map.addAttribute("locations", allLocation);
		return "display-location";
	}

	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap map) {
		Location location = locationService.getLocationById(id);
		locationService.deleteLocation(location);
		List<Location> allLocation = locationService.getAllLocation();
		map.addAttribute("locations", allLocation);
		return "display-location";
	}

	@RequestMapping("/editLocaion")
	public String editDisplayPage(@RequestParam("id") int id, ModelMap map) {
		Location location = locationService.getLocationById(id);
		map.addAttribute("locations", location);
		return "edit-locaion";
	}

	@RequestMapping("/edit-complete-location")
	public String editCompleteLocaion(@ModelAttribute("locaiont") Location location, ModelMap model) {
		locationService.getLocationById(location.getId());
		locationService.updateLocation(location);
		List<Location> allLocation = locationService.getAllLocation();
		model.addAttribute("locations", allLocation);
		return "display-location";
	}

	@RequestMapping("/generateReport")
	public String getPaiChart() {

		String path = servletContext.getRealPath("/");
		List<Object[]> data = repository.getTypeByTypeCount();
		report.generatePaiChart(path + "/report.jpeg", data);

		return "report";
	}
}
