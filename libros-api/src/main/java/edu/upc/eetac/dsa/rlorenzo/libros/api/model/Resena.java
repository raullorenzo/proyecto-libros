package edu.upc.eetac.dsa.rlorenzo.libros.api.model;

public class Resena {
	private int idresena;
	private int idlibro;
	private int iduser;
	private String text;
	
	public Resena(int idresena, int idlibro, int iduser, String text) {
		super();
		this.idresena = idresena;
		this.idlibro = idlibro;
		this.iduser = iduser;
		this.text = text;
	}

	public Resena() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdresena() {
		return idresena;
	}

	public void setIdresena(int idresena) {
		this.idresena = idresena;
	}

	public int getIdlibro() {
		return idlibro;
	}

	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Resena [idresena=" + idresena + ", idlibro=" + idlibro
				+ ", iduser=" + iduser + ", text=" + text + "]";
	}
	
	
	
	

}
