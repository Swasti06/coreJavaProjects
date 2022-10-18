package com.assessment.four;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PassportApplicantTest {

	@Test
	void PassportEligibilityAgeTest() {
		PassportApplicant a = new PassportApplicant("Swasti", 14, "Indian");
		assertThrows(InvalidAge.class, () -> a.passportEligibility());
	}

	@Test
	void PassportEligibilityNationalityTest() {
		PassportApplicant a = new PassportApplicant("Swasti", 28, "not Indian");
		assertThrows(Nationality.class, () -> a.passportEligibility());
	}
	@Test
	void PassportEligibilityCriminalRecordTest() {
		PassportApplicant a = new PassportApplicant("Swasti", 28, "not Indian");
		a.getCriminalRecord().equals("not clear");
		assertThrows(Nationality.class, () -> a.passportEligibility());
	}

	@Test
	void passportEligibleTest() throws InvalidAge, Nationality, CriminalRecord {
		PassportApplicant a = new PassportApplicant("Swasti", 28, "Indian");
		a.getCriminalRecord().equals("clear");
		boolean actual = a.checkApplicantforPassport();
		assertTrue(actual);
	}

}
