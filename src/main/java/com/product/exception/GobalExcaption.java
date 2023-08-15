package com.product.exception;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GobalExcaption {
	@ExceptionHandler(BrandNotFounds.class)
	public ResponseEntity<Object> brandNotFount(){
		return new ResponseEntity<Object>("Brand not found",HttpStatus.BAD_REQUEST); 
	}

}
