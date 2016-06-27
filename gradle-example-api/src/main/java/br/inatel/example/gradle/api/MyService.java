package br.inatel.example.gradle.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public interface MyService {

	@GET
	@Path("/say/{name}")
	@Produces(MediaType.TEXT_HTML)
	String sayHello(@PathParam("name") String name);

	@GET
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	int sum(@QueryParam("a") int a, @QueryParam("b") int b);

}
