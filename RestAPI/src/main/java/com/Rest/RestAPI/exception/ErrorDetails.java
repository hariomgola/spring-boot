package com.Rest.RestAPI.exception;

import java.time.LocalDate;

public class ErrorDetails {
	private LocalDate timeStamp;
	private String message;
	private String Details;

	public ErrorDetails(LocalDate timeStamp, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		Details = details;
	}

	public LocalDate getTimeStamp() {
		return timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return Details;
	}

	@Override
	public String toString() {
		return "ErrorDetails [timeStamp=" + timeStamp + ", message=" + message + ", Details=" + Details + "]";
	}

}
