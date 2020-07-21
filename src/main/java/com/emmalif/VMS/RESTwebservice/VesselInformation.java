package com.emmalif.VMS.RESTwebservice;

import javax.validation.Valid;

public class VesselInformation {
	// The Vessel Object
	@Valid
	private Vessel vessel;

	// The Position Object
	@Valid
	private Position position;

	// Constructor
	public VesselInformation(Vessel vessel, Position position) {
		super();
		this.vessel = vessel;
		this.position = position;
	}

	//Getters and setters for the vessel and position objects
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
