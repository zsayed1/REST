package com.zeshan.restwsAsync;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;

import com.zeshan.restwsAsync.model.CheckList;


@Path("/restwsasync")
// We dont use produces and consumes annotations in Asynchronous Web Services
//@Consumes("application/xml,application/json,application/x-www-form-urlencoded")
//@Produces("application/xml,application/json,application/x-www-form-urlencoded")
public interface CheckProcessor {
	
	@Path("/check")
	@POST
//	Suspended anotation tells cxf or jersy that the request procssing is suspended.But wait for the resposne
//	@Produces(MediaType.APPLICATION_JSON)

	public void processCheck(@Suspended AsyncResponse response,CheckList checklist);
	

}