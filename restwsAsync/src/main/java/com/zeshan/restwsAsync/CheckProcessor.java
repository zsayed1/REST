package com.zeshan.restwsAsync;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

import com.zeshan.restwsAsync.model.CheckList;


@Path("restwsAsync")
public interface CheckProcessor {
	
	@POST
	@Path("/check")
//	Suspended anotation tells cxf or jersy that the request procssing is suspended.But wait for the resposne
	public void processCheck(@Suspended AsyncResponse response,CheckList checklist);
	

}
