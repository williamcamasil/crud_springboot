package com.crudchallenge.challenge.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.crudchallenge.challenge.services.exceptions.DatabaseException;
import com.crudchallenge.challenge.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundException e, HttpServletRequest request) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError();
		//Pega o horário atual
		err.setTimestamp(Instant.now());
		//Pega o código e retorna o status que você desejar
		err.setStatus(status.value());
		err.setError("Resource not found");
		//Pega a exceção que deu
		err.setMessage(e.getMessage());
		//Pega o caminho da requisição que foi feito
		err.setPath(request.getRequestURI());
		//Retorna o status que você quiser, e o corpo com as informações sobre o erro nesse caso o objeto err 
		return ResponseEntity.status(status).body(err);

	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request) {
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError();
		//Pega o horário atual
		err.setTimestamp(Instant.now());
		//Pega o código e retorna o status que você desejar
		err.setStatus(status.value());
		err.setError("Database exception");
		//Pega a exceção que deu
		err.setMessage(e.getMessage());
		//Pega o caminho da requisição que foi feito
		err.setPath(request.getRequestURI());
		//Retorna o status que você quiser, e o corpo com as informações sobre o erro nesse caso o objeto err 
		return ResponseEntity.status(status).body(err);

	}
	
}