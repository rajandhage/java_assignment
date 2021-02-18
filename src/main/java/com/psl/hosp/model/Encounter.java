package com.psl.hosp.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="encounter")
public class Encounter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="encounter_id")
	private int encounterId;
	
	@Column(name="date_of_encounter")
	private LocalDate dateOfEncounter;
	
	@Column(name="time_of_encounter")
	private LocalTime timeOfEncounter;
	
	@Column(name="trigger_issue")
	private String triggerIssue;
	
	@Column(name="diagnosis")
	private String diagnosis;
	
	@Column(name="medicines")
	private String medicines;
	
	@Column(name="billing_amount")
	private float billingAmount;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="patient_id")
	private Patient patient;

	public Encounter(LocalDate dateOfEncounter, String triggerIssue, String diagnosis, String medicines,
			float billingAmount) {
		super();
		this.dateOfEncounter = dateOfEncounter;
		this.triggerIssue = triggerIssue;
		this.diagnosis = diagnosis;
		this.medicines = medicines;
		this.billingAmount = billingAmount;
	}
	
	public Encounter() {
		super();
	}

	public LocalDate getDateOfEncounter() {
		return dateOfEncounter;
	}

	public void setDateOfEncounter(LocalDate dateOfEncounter) {
		this.dateOfEncounter = dateOfEncounter;
	}

	public String getTriggerIssue() {
		return triggerIssue;
	}

	public void setTriggerIssue(String triggerIssue) {
		this.triggerIssue = triggerIssue;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getMedicines() {
		return medicines;
	}

	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}

	public float getBillingAmount() {
		return billingAmount;
	}

	public void setBillingAmount(float billingAmount) {
		this.billingAmount = billingAmount;
	}
	
	
}
