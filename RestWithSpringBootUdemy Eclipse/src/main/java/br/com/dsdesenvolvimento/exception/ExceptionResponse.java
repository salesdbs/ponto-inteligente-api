package br.com.dsdesenvolvimento.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Date timestamp;
	private String messege;
	private String details;
	
	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp =timestamp;
		this.messege = message;
		this.details = details;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessege() {
		return messege;
	}

	public String getDetails() {
		return details;
	}

	
	
	
}
