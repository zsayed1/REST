package com.zeshan.restwssecurity;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zeshan.restwssecurity.model.Product;


@Path("/restwssecurity")
@Produces("application/xml")
@Consumes("application/xml")
public interface ProductService {
	
	@GET
	@Path("/prod")
	@Produces("application/xml")
	List<Product> getproduct();
	
	
	@POST
	@Path("/prod")
	@Produces("application/xml")
	int addproduct(Product product);
	}
