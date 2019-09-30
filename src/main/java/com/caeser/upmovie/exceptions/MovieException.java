package com.caeser.upmovie.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND ,reason="not found 10001")
public class MovieException  extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9141529090618182905L;

	public MovieException(String msg){
		super(msg);
	}
}
