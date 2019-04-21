package com.zeshan.restPassenger;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.zeshan.restPassenger.model.Passenger;



@Service
public class PassengerServiceImpl implements PassengerService {

	ArrayList<Passenger> passengers = new ArrayList<>();
	String currentID= "123";
	@Override
	public List<Passenger> getPassengers(int start, int size) {
		// TODO Auto-generated method stub
		
		System.out.println(start);
		System.out.println(size);
		return passengers;
	}

	@Override
	public Passenger addPassenger(Passenger pass) {
		pass.setId(currentID);
		passengers.add(pass);
		return pass;
	}

}