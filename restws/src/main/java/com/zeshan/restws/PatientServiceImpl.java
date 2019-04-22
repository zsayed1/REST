package com.zeshan.restws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.zeshan.restws.exceptions.PatientBusinessException;
import com.zeshan.restws.model.Patient;

// This class is used to create methods to run the logic behind the Service


@Service
public class PatientServiceImpl implements PatientService {
	long currentID= 123;
	
	// in-memory map that will hold our database
	//which has keys as patient id and values as object of patient class
	Map<Long,Patient> patients = new HashMap<>();
	
	// Initialize patient to not to add we can use getters.
	public PatientServiceImpl() {
		// to initialize to keep contructor clean
		init();
		
	}

	public void init() {
		//calling empty constructor to create a new entry
		Patient patient = new Patient();
		patient.setId(currentID);
		patient.setName("Zeshan");
		//adding the values to the map
		patients.put(patient.getId(), patient);
	}

	@Override
	public List<Patient> getPatients() {
		// Get the values from the Map
		Collection<Patient> results= patients.values();
		//Convert it to a ArrayList
		List<Patient> response = new ArrayList<>(results);
		return response;	
	}

	@Override
	public Response createPatient(Patient patient) {
		// set the value
		patient.setId(++currentID);
		//add the values to the map
		patients.put(patient.getId(),patient);
		// return the response and pass patient object
		return Response.ok(patient).build();
	}

	@Override
	public Patient getPatient(long id) {
		if(patients.get(id)==null)
		{
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
		return patients.get(id);
		
	}

	@Override
	public Response updatePatient(Patient patient) {
		Patient currentpat = patients.get(patient.getId());
		Response response;
		if(currentpat != null) {
			patients.put(patient.getId(), patient);
			response = Response.ok().build();
		}
		else
		{
//			response = Response.notModified().build();
			throw new PatientBusinessException();
		}
		return response ;
	}

	@Override
	public Response deletePatient(long id) {
		Patient patient = patients.get(id);
		Response response;
		if(patient!=null) {
			patients.remove(id);
			response = Response.ok().build();
		}
		else {
			response = Response.notModified().build();
		}
		return response;
	}
//	@Override
//	public void formadd(String firstName, String lastName) {
//		System.out.println(firstName);
//		System.out.println(lastName);
//		Response response;
//		response = Response.ok().build();
//		
//	}
//	@Override
//	public void agentadd(String firstName, String lastName, String agent) {
////		System.out.println(firstName);
////		System.out.println(lastName);
//		System.out.println(agent);
//		Response response;
//		response = Response.ok().build();
//		
//	}

	
	@Override
	public void HttpHeaderAdd(String firstName, String lastName, HttpHeaders headers) {
		// TODO Auto-generated method stub
		MultivaluedMap<String, String> requestHeaders = headers.getRequestHeaders();
		Set<String> keySet = requestHeaders.keySet();
		for (String key : keySet) {
			System.out.println(key+"=="+headers.getHeaderString(key));		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
