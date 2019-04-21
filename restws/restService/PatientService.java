package com.zeshan.restService;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.zeshan.restService.model.Patient;

@Path("/patser")
public interface PatientService {
	@Path("/pat")
	@GET
	List<Patient> getPatients();
	

}
