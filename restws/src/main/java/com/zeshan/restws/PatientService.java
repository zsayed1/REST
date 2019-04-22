package com.zeshan.restws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;


import com.zeshan.restws.model.Patient;
@Consumes("application/xml,application/json,application/x-www-form-urlencoded")
@Produces("application/xml,application/json,application/x-www-form-urlencoded")
@Path("/patser")
public interface PatientService {
	@Path("/pat")
	@GET
	List<Patient> getPatients();
	
	@Path("/pat/{id}")
	@GET
	Patient getPatient(@PathParam(value = "id") long id);
	
	@Path("/pat")
	@PUT
	Response updatePatient(Patient patient);
	
	@Path("/pat")
	@POST
	Response createPatient(Patient patient); 
	
	@Path("/pat/{id}")
	@DELETE
	Response deletePatient(@PathParam(value = "id") long id);

	
//	Getting the formparams
//	@Path("/pat")
//	@POST
//	@Produces( "application/xml")
//	void formadd(@FormParam("firstName") String firstName,@FormParam("lastName") String lastName);
//
//// Getting the header thru agent	
//	@Path("/pat")
//	@POST
//	@Produces( "application/xml")
//	void agentadd(@FormParam("lastName")String lastName,@FormParam("firstName") String firstName,@HeaderParam("agent") String agent);

//	Getting it thru Httprequest
	@Path("/pat")
	@POST
	@Produces("application/json")
	void HttpHeaderAdd(@FormParam("firstName")String firstName,@FormParam("lastName") String lastName,@Context HttpHeaders headers);
}
	
}
