package com.thiago.cursomc.services.exceptions;

// Classe customizada de exception de objeto nao encontrado
public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	// Recebe a mensagem de error e lança para a super classe
	public ObjectNotFoundException(String msg) {
		super(msg);
	}

	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
