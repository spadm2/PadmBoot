package com.airindia.reserve.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Flight extends AbstractIdUtil {
	private String flightNumber;
	private String departmentCity;
	private String arrivelCity;
	private Date dateOfDeparture;
	private Timestamp estimatedDepartureTime;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDepartmentCity() {
		return departmentCity;
	}

	public void setDepartmentCity(String departmentCity) {
		this.departmentCity = departmentCity;
	}

	public String getArrivelCity() {
		return arrivelCity;
	}

	public void setArrivelCity(String arrivelCity) {
		this.arrivelCity = arrivelCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}

}
