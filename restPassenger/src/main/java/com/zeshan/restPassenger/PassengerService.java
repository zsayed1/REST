package com.zeshan.restPassenger;

import java.util.List;
import javax.ws.rs.*;
import com.zeshan.restPassenger.model.Passenger;
@Path("/passengerservice")
@Produces("application/xml")
// USed when form param is used 
@Consumes("application/xml,application/x-www-form-urlencoded")

public interface PassengerService {
	@Path("/pass")
	@GET
	List<Passenger> getPassengers(@QueryParam("start")int start, @QueryParam("size")int size);
	
	@Path("/pass")
	@POST
	Passenger addPassenger(Passenger pass);
	
	
	@Path("/pass")
	@POST
	void formaddPassenger(@FormParam("firstName")String firstName, @FormParam("lastName")String lastName, @HeaderParam("agent")String agent);
	
//	@Path("/pass")
//	@POST
//	void formaddPassenger(@FormParam("firstName")String firstName, @FormParam("lastName")String lastName);
//	
//	
//	
	
}
