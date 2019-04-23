package com.zeshan.restwsAsync;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

import com.zeshan.restwsAsync.model.CheckList;


@Path("restwsAsync")
@Produces("application/xml")
@Consumes("application/xml")
public interface CheckProcessor {
	
	
	@Path("/check")
	@POST
	@Produces("application/xml")
//	Suspended anotation tells cxf or jersy that the request procssing is suspended.But wait for the resposne
	public void processCheck(@Suspended AsyncResponse response,CheckList checklist);
	

}