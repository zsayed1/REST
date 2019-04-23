package com.zeshan.restwsclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.zeshan.restclient.model.Patient;

public class PatientWSClient {
	private static final String BASE_URL = "http://localhost:8080/restws/services/patser";

	public static void main(String args[]) {

//		Client to create a client with CLient Builder
		Client client = ClientBuilder.newClient();
//      Webtarget to point to the rest endpoint	
//		Passing parameters and dynamically passing URI
		WebTarget target = client.target(BASE_URL).path("/pat").path("/{id}").resolveTemplate("id", 123);
// 	    Builder to create invocation builder
		Builder request = target.request();
//		Creating response to save the response
//		Response response = request.get();
//		To get the entity from the response
		Patient patient = request.get(Patient.class);

//		Get the status from reponse
//		System.out.println(response.getStatus());
		System.out.println(patient.getName());
    
		
		
		
//		PUT
		patient.setName("Louis");
		WebTarget putTarget = client.target(BASE_URL).path("/pat");

		Response updateResponse = putTarget.request().put(Entity.entity(patient, MediaType.APPLICATION_XML));
        System.out.println(updateResponse.getStatus());
        updateResponse.close();
        
//      POST
        
        Patient pat = new Patient();
        pat.setName("Anam");
        
        WebTarget postTarget=client.target(BASE_URL).path("/pat");
        Patient createdID=postTarget.request().post(Entity.entity(pat,MediaType.APPLICATION_XML),Patient.class);
        System.out.println("Crated Patient ID"+createdID.getId() );
        
//       To clean up resources 
        client.close();
        
        
        
		
	}

}
