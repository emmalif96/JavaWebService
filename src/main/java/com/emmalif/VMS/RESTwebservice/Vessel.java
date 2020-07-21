package com.emmalif.VMS.RESTwebservice;

import javax.validation.constraints.NotBlank;

//The Object for Vessel
public class Vessel {

	// Name of the vessel
	@NotBlank(message = "Name is mandatory")
	private String name;

	//Constructor
	public Vessel(@NotBlank(message = "Name is mandatory") String name, String country) {
		super();
		this.name = name;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
