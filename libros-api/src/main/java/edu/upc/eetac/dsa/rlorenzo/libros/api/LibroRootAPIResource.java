package edu.upc.eetac.dsa.rlorenzo.libros.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import edu.upc.eetac.dsa.rlorenzo.libros.api.model.LibroRootAPI;

@Path("/")
public class LibroRootAPIResource {
	@GET
	public LibroRootAPI getRootAPI() {
		LibroRootAPI api = new LibroRootAPI();
		return api;
	}

}



 
 
