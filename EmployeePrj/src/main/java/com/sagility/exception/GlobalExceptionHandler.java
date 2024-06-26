package com.sagility.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handlerException(Exception e){
		return new ResponseEntity("An excecption occured"+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handlerException(NoSuchElementException e){
		return new ResponseEntity("No Employee Present with given id "+e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	
	

}
