package com.psl.hosp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.hosp.dao.EncounterDao;
import com.psl.hosp.model.Encounter;
import com.psl.hosp.utiliy.Utility;

@Service
public class EncounterService {
	
	@Autowired
	private EncounterDao encounterDao;
	
	@Autowired
	private Utility utility;
	
	public List<Encounter> getLastNEncounters(int patientId, int lastNEncounters) {
		List<Encounter> listOfEncounters = encounterDao.findByPatientPatientId(patientId);
		System.out.println(listOfEncounters);
		return null;
	}



	public Map<String, Object> addEncounter(Map<String, Object> request) throws Exception {
		utility.checkKeys(request, "dateOfEncounter", "timeOfEncounter", "triggerIssue", "diagnosis", "medicines", "billingAmount", "patientId");
		utility.checkIfStringAndNonEmpty(request, "triggerIssue", "billingAmount");
		utility.checkIfDateValid(request.get("dateOfEncounter").toString().trim());
		utility.checkIfTimeValid(request.get("timeOfEncounter").toString().trim());
		
		return null;
	}



	public Map<String, Object> deleteEncounter(int encounterId) {
		// TODO Auto-generated method stub
		return null;
	}



	public Map<String, Object> updateEncounter(Map<String, Object> request) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
