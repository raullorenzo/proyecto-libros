package edu.upc.eetac.dsa.rlorenzo.libros.api.model;


public class LibroError {
	private int status;
	private String message;
	
 
	public LibroError() {
		super();
	}
 
	public LibroError(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
 
	public int getStatus() {
		return status;
	}
 
	public void setStatus(int status) {
		this.status = status;
	}
 
	public String getMessage() {
		return message;
	}
 
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "LibroError [status=" + status + ", message=" + message + "]";
	}
	
	
}