package com.assessment.four;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PassportApplicant {
	private String name;
	private int age;
	private String nationality;
	private String criminalRecord;

	Log logger = LogFactory.getLog(PassportApplicant.class);

	public boolean checkApplicantforPassport() throws InvalidAge, Nationality, CriminalRecord {
		if (this.age < 18) {
			logger.info("Age is not valid");
			throw new InvalidAge("Age not valid for applying");
		} else if ((this.nationality).equals("not Indian")) {
			logger.info("Nationality not accepted");
			throw new Nationality("Applicant is not Indian");
		} else if ((this.criminalRecord).equals("not clear")) {
			logger.info("Has criminal background");
			throw new CriminalRecord("Applicant is a criminal");
		}
		return true;
	}

	public boolean passportEligibility() throws InvalidAge, Nationality, CriminalRecord {
		boolean eligible = checkApplicantforPassport();
		return eligible;

	}

	public String getCriminalRecord() {
		return criminalRecord;
	}

	public void setCriminalRecord(String criminalRecord) {
		this.criminalRecord = criminalRecord;
	}

	public PassportApplicant(String name, int age, String nationality) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "PassportApplicant [name=" + name + ", age=" + age + ", nationality=" + nationality + "]";
	}

}