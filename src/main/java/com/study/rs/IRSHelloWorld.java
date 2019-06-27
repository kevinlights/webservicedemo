package com.study.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/rshelloworld")
public interface IRSHelloWorld {

	@GET
	@Path("/sayhello/{name}")
	public String sayhello(@PathParam("name") String name);
	
	@GET
	@Path("/saybye")
	public String saybye(@QueryParam("name") String name);
}
