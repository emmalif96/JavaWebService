package com.emmalif.VMS.RESTwebservice;

import javax.validation.Valid;

public class VesselInformation {

	//Unique id 
	private Integer id;

	// The Vessel Object
	@Valid
	private Vessel vessel;

	//The Position Object
	@Valid
	private Position position;

	//Constructor
	public VesselInformation(Integer id, Vessel vessel, Position position) {
		super();
		this.id = id;
		this.vessel = vessel;
		this.position = position;
	}

	//Getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Vessel getVessel() {
		return vessel;
	}

	public void setVessel(Vessel vessel) {
		this.vessel = vessel;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
}
