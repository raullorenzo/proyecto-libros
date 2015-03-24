package edu.upc.eetac.dsa.rlorenzo.libros.api.model;

import java.util.List;

import javax.ws.rs.core.Link;

import org.glassfish.jersey.linking.Binding;
import org.glassfish.jersey.linking.InjectLink;
import org.glassfish.jersey.linking.InjectLinks;
import org.glassfish.jersey.linking.InjectLink.Style;

import edu.upc.eetac.dsa.rlorenzo.libros.api.MediaType;
import edu.upc.eetac.dsa.rlorenzo.libros.api.LibroResource;

public class Libro {
	@InjectLinks({
		@InjectLink(resource = LibroResource.class, style = Style.ABSOLUTE, rel = "stings", title = "Latest stings", type = MediaType.BEETER_API_STING_COLLECTION),
		@InjectLink(resource = LibroResource.class, style = Style.ABSOLUTE, rel = "self edit", title = "Sting", type = MediaType.BEETER_API_STING, method = "getSting", bindings = @Binding(name = "stingid", value = "${instance.stingid}")) })
	private List<Link> links;
	private int idlibro;
	private List<Autor> autores;
	private String titulo;
	private String lengua;
	private String edicion;
	private String editorial;
	private String fechaedicion;
	private String fechaimpresion;
	private List<Resena> resenas;
	
	public Libro(int idlibro, List<Autor> autores, String titulo,
			String lengua, String edicion, String editorial,
			String fechaedicion, String fechaimpresion, List<Resena> resenas) {
		super();
		this.idlibro = idlibro;
		this.autores = autores;
		this.titulo = titulo;
		this.lengua = lengua;
		this.edicion = edicion;
		this.editorial = editorial;
		this.fechaedicion = fechaedicion;
		this.fechaimpresion = fechaimpresion;
		this.resenas = resenas;
	}

	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdlibro() {
		return idlibro;
	}

	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLengua() {
		return lengua;
	}

	public void setLengua(String lengua) {
		this.lengua = lengua;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getFechaedicion() {
		return fechaedicion;
	}

	public void setFechaedicion(String fechaedicion) {
		this.fechaedicion = fechaedicion;
	}

	public String getFechaimpresion() {
		return fechaimpresion;
	}

	public void setFechaimpresion(String fechaimpresion) {
		this.fechaimpresion = fechaimpresion;
	}

	public List<Resena> getResenas() {
		return resenas;
	}

	public void setResenas(List<Resena> resenas) {
		this.resenas = resenas;
	}

	@Override
	public String toString() {
		return "Libro [idlibro=" + idlibro + ", autores=" + autores
				+ ", titulo=" + titulo + ", lengua=" + lengua + ", edicion="
				+ edicion + ", editorial=" + editorial + ", fechaedicion="
				+ fechaedicion + ", fechaimpresion=" + fechaimpresion
				+ ", resenas=" + resenas + "]";
	}

	
	
	
	

}
