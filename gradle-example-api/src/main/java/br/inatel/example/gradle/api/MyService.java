package br.inatel.example.gradle.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Example RESTful Web Service.
 */
@Path("/hello")
public interface MyService {

	/**
	 * Says hello to the given name.
	 * @param name The name to be hailed.
	 * @return The hail message.
	 */
	@GET
	@Path("/say/{name}")
	@Produces(MediaType.TEXT_HTML)
	String sayHello(@PathParam("name") String name);

	/**
	 * Sum two integer numbers.
	 * @param a The first number.
	 * @param b The second number.
	 * @return The resulting sum.
	 */
	@GET
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	int sum(@QueryParam("a") int a, @QueryParam("b") int b);

}
