package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserRestService {

	@GET
	@Path("{id}")
	public Response getUserById(@PathParam("id") String id) {

		return Response.status(200).entity("getUserById is called, id : " + id).build();

	}

	@GET
	@Path("{year}/{month}/{day}")
	public Response getUserHistory(@PathParam("year") int year,@PathParam("month") int month, @PathParam("day") int day) {

		String date = year + "/" + month + "/" + day;

		return Response.status(200).entity("This is for you James :) oh and The Date today is, year/month/day : " + date).build();

	}
	
}

//URL = add to end of url ---> /users/2017/01/10     or any other date