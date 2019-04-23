package com.zeshan.restwsAsyncClient;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class CheckProcessingClient {

	public static void main(String[] args) {
		// Create a client as we create using Client Builder
		Client newClient = ClientBuilder.newClient();
		// Create Web Target with client.target to point to the rest endpoint
		WebTarget target= newClient.target("http://localhost:8080/restwsAsync").path("/check");
		// Now w use target.request().async() and assign it to an invoker
		AsyncInvoker async = target.request().async();
        // Then we specify the post request with type and what to be passed and then we  assign it a locval variable 
		Future<Boolean> response = async.post(Entity.entity(new CheckList(), MediaType.APPLICATION_XML),Boolean.class);
		// No we print the future response and then surround it with try catch
		try {
			System.out.println(response.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
