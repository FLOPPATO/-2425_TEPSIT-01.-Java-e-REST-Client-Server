package vignetti.webapp.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("test")
public class Ciao {
    @GET
    @Path("{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String ciaoConNome(@PathParam("name") String name) {
        return "Ciao " + name.toUpperCase();
    }
}