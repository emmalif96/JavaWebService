package com.emmalif.VMS.RESTwebservice;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	//This is for handling 503 errors - Internal Server Errors 
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) {
		ExceptionDetails exceptionDetails = new ExceptionDetails(new Date(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity(exceptionDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	//This is for handling 404 errors - Not Found
	@ExceptionHandler(VesselInformationNotFoundException.class)
	public final ResponseEntity<Object> handleVesselInformationNotFoundException(Exception ex, WebRequest request) {
		ExceptionDetails exceptionDetails = new ExceptionDetails(new Date(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity(exceptionDetails, HttpStatus.NOT_FOUND);
	}

//	//This is to show a proper error message when the posted data is not valid
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		ExceptionDetails exceptionDetails = new ExceptionDetails(new Date(), "Validation Failed",
				ex.getBindingResult().toString());
		return new ResponseEntity(exceptionDetails, HttpStatus.NOT_FOUND);
	}

}
