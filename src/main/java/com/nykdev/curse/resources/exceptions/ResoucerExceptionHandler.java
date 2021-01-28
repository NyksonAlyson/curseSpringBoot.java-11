package com.nykdev.curse.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.nykdev.curse.services.exception.ResourceNotFoundException;

@ControllerAdvice
public class ResoucerExceptionHandler {
	
@ExceptionHandler(ResourceNotFoundException.class)	
public ResponseEntity<StanderError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
	String error = "Resource not found";
	HttpStatus status = HttpStatus.NOT_FOUND;
	StanderError err = new StanderError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
	return ResponseEntity.status(status).body(err);
	}

}