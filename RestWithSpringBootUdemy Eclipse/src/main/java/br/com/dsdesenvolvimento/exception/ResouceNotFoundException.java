package br.com.dsdesenvolvimento.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResouceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ResouceNotFoundException(String exception) {
		super(exception);
	}
	// FALTA IMPLEMENTAR 
	// https://www.udemy.com/course/restful-apis-do-0-a-nuvem-com-springboot-e-docker/learn/lecture/14147993#questions
	
}
