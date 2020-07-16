package com.emmalif.VMS.RESTwebservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class VesselInformationService {

	private static List<VesselInformation> vesselInformationList = new ArrayList<>();

	private static int vesselCounter = 1;
	//Putting vessel information to have an example
	static {
		Vessel vessel = new Vessel("ARCADIA", "Bermuda");
		Position position = new Position(new Date(), 16.871311, 96.199379, 37.04);
		vesselInformationList.add(new VesselInformation(1, vessel, position));
	}

	//The method for finding all the vessel information
	public List<VesselInformation> findAll() {
		return vesselInformationList;
	}
	//A method for setting the Information into the List
	public static void setVesselInformationList(List<VesselInformation> vesselInformationList) {
		VesselInformationService.vesselInformationList = vesselInformationList;
	}

	//The method for saving(Posting) new data into the List
	@ResponseBody
	public VesselInformation save(VesselInformation vesselInformation) {
		//Making a unique id for the new data
		if (vesselInformation.getId() == null) {
			vesselInformation.setId(++vesselCounter);
		}
		//vesselInformation.getVessel().getCountry() remove("country");
		vesselInformationList.add(vesselInformation);
		return vesselInformation;
	}

	//The method that displays appropriate vessel information according to the id that is given
	public VesselInformation findOne(int id) {
		for (VesselInformation vesselInformation : vesselInformationList) {
			if (vesselInformation.getId() == id) {
				return vesselInformation;
			}
		}
		return null;
	}

}
