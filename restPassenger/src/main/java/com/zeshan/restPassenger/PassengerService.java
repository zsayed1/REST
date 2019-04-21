package com.zeshan.restPassenger;

import java.util.List;
import javax.ws.rs.*;
import com.zeshan.restPassenger.model.Passenger;
@Path("/passengerservice")
@Produces("application/xml")
@Consumes("application/xml")

public interface PassengerService {
	@Path("/pass")
	@GET
	List<Passenger> getPassengers(@QueryParam("start")int start, @QueryParam("size")int size);
	
	@Path("/pass")
	@POST
	Passenger addPassenger(Passenger pass);
	
	
	
}
