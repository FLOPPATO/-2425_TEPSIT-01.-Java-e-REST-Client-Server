package vignetti.webapp.route;

import org.glassfish.jersey.server.ResourceConfig;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/api")
public class Route extends ResourceConfig {
    public Route() {
        packages("vignetti.webapp.rest");
    }
}
