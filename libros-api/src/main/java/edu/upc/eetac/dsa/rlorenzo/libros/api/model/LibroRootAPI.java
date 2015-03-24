package edu.upc.eetac.dsa.rlorenzo.libros.api.model;

import java.util.List;

import javax.ws.rs.core.Link;

import org.glassfish.jersey.linking.InjectLink;
import org.glassfish.jersey.linking.InjectLink.Style;
import org.glassfish.jersey.linking.InjectLinks;

import edu.upc.eetac.dsa.rlorenzo.libros.api.LibroRootAPIResource;
import edu.upc.eetac.dsa.rlorenzo.libros.api.LibroResource;
import edu.upc.eetac.dsa.rlorenzo.libros.api.MediaType;


public class LibroRootAPI {
	
	@InjectLinks({
        @InjectLink(resource = LibroRootAPIResource.class, style = Style.ABSOLUTE, rel = "self bookmark home", title = "Beeter Root API"),
        @InjectLink(resource = LibroResource.class, style = Style.ABSOLUTE, rel = "collection", title = "Latest stings", type = MediaType.BEETER_API_STING_COLLECTION),
        @InjectLink(resource = LibroResource.class, style = Style.ABSOLUTE, rel = "create-sting", title = "Create new sting", type = MediaType.BEETER_API_STING)})
		private List<Link> links;

		public List<Link> getLinks() {
			return links;
		}

		public void setLinks(List<Link> links) {
			this.links = links;
		}

}
