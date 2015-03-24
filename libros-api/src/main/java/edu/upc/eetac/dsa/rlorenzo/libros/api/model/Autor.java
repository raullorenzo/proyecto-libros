package edu.upc.eetac.dsa.rlorenzo.libros.api.model;

public class Autor {
	private int idautor;
	private String autorname;
	
	public Autor(int idautor, String autorname) {
		super();
		this.idautor = idautor;
		this.autorname = autorname;
	}

	public Autor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdautor() {
		return idautor;
	}

	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}

	public String getAutorname() {
		return autorname;
	}

	public void setAutorname(String autorname) {
		this.autorname = autorname;
	}

	@Override
	public String toString() {
		return "Autor [idautor=" + idautor + ", autorname=" + autorname + "]";
	}
	
	
	
	

}
