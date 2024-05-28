package com.tyk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tyk.exception_handeling.ResourceException;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    /**
     * Handles ResourceExceptions for the SpringMVC controllers.
     * @param e SpringMVC controller exception.
     * @return http response entity
     * @see ExceptionHandler
     */
	@ExceptionHandler(ResourceException.class)
    public ResponseEntity handleException(ResourceException e) {
        return ResponseEntity.status(e.getHttpStatus()).body(e.getMessage());
    }
	}
