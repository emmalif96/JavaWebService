package com.emmalif.VMS.RESTwebservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class VesselInformationService {

	// A list to store vesselInformation objects
	private static List<VesselInformation> vesselInformationList = new ArrayList<>();

	// Insert vessel information to have an example
	static {
		Vessel vessel = new Vessel("ARCADIA", "Bermuda");
		Position position = new Position(new Date(), 0.890117918517108, 0.40142572795869574, 27.04);
		vesselInformationList.add(new VesselInformation(vessel, position));
	}

	// returns the stored list of VesselInformation objects
	public List<VesselInformation> findAll() {
		return vesselInformationList;
	}
	// A method for setting the Information into the List
	public static void setVesselInformationList(List<VesselInformation> vesselInformationList) {
		VesselInformationService.vesselInformationList = vesselInformationList;
	}

	// The method for saving(Posting) new data into the List
	@ResponseBody
	public VesselInformation save(VesselInformation vesselInformation) {
		// format the information
		formatVesselInformation(vesselInformation);
		// add to storage
		vesselInformationList.add(vesselInformation);
		// return the object
		return vesselInformation;
	}

	// Formats the VesselInformation object
	private void formatVesselInformation(VesselInformation vesselInformation) {
		// calculate
		double latitudeRadians = degreesToRadians(vesselInformation.getPosition().getLatitude());
		double longitudeRadians = degreesToRadians(vesselInformation.getPosition().getLongitude());
		double speedMps = knotsToMps(vesselInformation.getPosition().getSpeed());
		// set the information
		vesselInformation.getPosition().setLatitude(latitudeRadians);
		vesselInformation.getPosition().setLongitude(longitudeRadians);
		vesselInformation.getPosition().setSpeed(speedMps);
	}

	// Calcules radians from degrees
	private static double degreesToRadians(double degrees){
		return degrees * Math.PI/180;
	}

	// Calculates Meters per Second from Knots
	private static double knotsToMps (double knots) {
		return knots * 0.514444;
	}
}
