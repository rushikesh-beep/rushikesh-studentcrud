package com.cts.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptions {

	
	 @ExceptionHandler(HandlingExceptions.class)
	 public ResponseEntity<String> handleRegister(HandlingExceptions ex) {
	        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	    }

	    @ExceptionHandler(loginException.class)
	    public ResponseEntity<String> handleLogin(loginException ex) {
	        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
	    }
}
