package com.globalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<Object> rest(NameNotFoundException ne)
	{
		return new ResponseEntity<Object>(ne.getMessage(),HttpStatus.ALREADY_REPORTED);
	}
	@ExceptionHandler(PriceNotFoundException.class)
	public ResponseEntity<Object> price(PriceNotFoundException pe)
	{
		return new ResponseEntity<Object>(pe.getMessage(),HttpStatus.NOT_FOUND);
	}
//	@ExceptionHandler(MismatchException.class)
//	public ResponseEntity<Object> check(MismatchException me)
//	{
//		return new ResponseEntity<Object>(me.getMessage(),HttpStatus.BAD_REQUEST);
//	}
}
