package com.emmalif.VMS.RESTwebservice;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

//Object for Position
public class Position {

	// the date of the position information
	@Past
	private Date date;

	// the date of receiving the information
	private Date receivedDate;

	// latitude in radians
	@NotNull
	private double latitude;

	// longitude in radians
	@NotNull
	private double longitude;

	// speed in knots
	@NotNull
	private double speed;

	//Constructor
	public Position(Date date, double latitude, double longitude, double speed) {
		super();
		this.date = date;
		this.receivedDate = new Date();
		this.latitude = latitude;
		this.longitude = longitude;
		this.speed = speed;
	}

	//Getters and Setters
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}
