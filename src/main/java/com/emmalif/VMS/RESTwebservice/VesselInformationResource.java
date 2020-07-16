package com.emmalif.VMS.RESTwebservice;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VesselInformationResource {

	@Autowired
	private VesselInformationService service;

	// A method to GET all of the vessel Information
	@GetMapping("/vesselInformation")
	public List<VesselInformation> retrieveAllVesselInformation() {

		return service.findAll();
	}

	//A method to search(GET) for one specific Vessel and all of it's information
	@GetMapping("/vesselInformation/{id}")
	public VesselInformation retrieveVesselInformation(@PathVariable int id) {
		VesselInformation vesselInformation = service.findOne(id);
		if (vesselInformation == null) {
			//Error handling if no vessel has that specific Id
			throw new VesselInformationNotFoundException("id - " + id);
		}
		return service.findOne(id);
	}

	//A method to POST information about a vessel
	@PostMapping("/vesselInformation")
	public ResponseEntity<Object> createVesselInformation(@Valid @RequestBody VesselInformation vesselInformation) {
		VesselInformation savedVesselInformation = service.save(vesselInformation);

		// This is for the status: 201 Created Response Header and to show the ResponseBody
		return new ResponseEntity<Object>(savedVesselInformation, HttpStatus.CREATED);
	}

}
