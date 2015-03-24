package edu.upc.eetac.dsa.rlorenzo.libros.api.model;

public class AutorLibro {
	private int idautor;
	private int idlibro;
	
	public AutorLibro(int idautor, int idlibro) {
		super();
		this.idautor = idautor;
		this.idlibro = idlibro;
	}

	public AutorLibro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public int getIdautor() {
		return idautor;
	}

	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}

	public int getIdlibro() {
		return idlibro;
	}

	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}

	@Override
	public String toString() {
		return "AutorLibro [idautor=" + idautor + ", idlibro=" + idlibro + "]";
	}
	
	

}
