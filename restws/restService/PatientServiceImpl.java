package com.zeshan.restService;

import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zeshan.restService.model.Patient;

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
}
