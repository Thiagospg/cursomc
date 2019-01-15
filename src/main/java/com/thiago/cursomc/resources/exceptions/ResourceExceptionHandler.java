package com.thiago.cursomc.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.thiago.cursomc.services.exceptions.ObjectNotFoundException;


@ControllerAdvice // Anotação auxiliar do controlador.
// Manipulador de exceptions
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	// <StandardError> - objeto que contem a informacao do error
	// ObjectNotFoundException a excecao, HttpServletRequest a requisicao
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {

		// Instancia o StandardError com os valores do Status, Mensagem e tempo 
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		
		// Retorna o ResponseEntity com o error 404 e com o body contendo informacoes do error
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
