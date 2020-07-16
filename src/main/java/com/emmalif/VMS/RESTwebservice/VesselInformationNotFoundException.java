package com.emmalif.VMS.RESTwebservice;

//Not found Exception that is used in the CustomeResponseEntityExceptionHandler
public class VesselInformationNotFoundException extends RuntimeException {
	public VesselInformationNotFoundException(String message) {
		super(message);
	}
}
