package com.assessment.four;

import java.util.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<String> listOfCriminals = new ArrayList<>();
		listOfCriminals.add("Bob");
		listOfCriminals.add("Jack");

		Log logger = LogFactory.getLog(MainClass.class);

		PassportApplicant pa1 = new PassportApplicant("Bob", 25, "Indian");
		for(int i=0; i<listOfCriminals.size();i++) {
			if(pa1.getName().equals(listOfCriminals.get(i))) {
				pa1.setCriminalRecord("not clear");
			}
			else {
				pa1.setCriminalRecord("clear");
			}
		}
		PassportApplicant pa2 = new PassportApplicant("Jack", 30, "Indian");
		for(int i=0; i<listOfCriminals.size();i++) {
			if(pa2.getName().equals(listOfCriminals.get(i))) {
				pa2.setCriminalRecord("not clear");
			}
			else {
				pa2.setCriminalRecord("clear");
			}
		}
		PassportApplicant pa3 = new PassportApplicant("Swasti", 22, "Indian");
		for(int i=0; i<listOfCriminals.size();i++) {
			if(pa3.getName().equals(listOfCriminals.get(i))) {
				pa3.setCriminalRecord("not clear");
			}
			else {
				pa3.setCriminalRecord("clear");
			}
		}
		PassportApplicant pa4 = new PassportApplicant("Manya", 23, "not Indian");
		for(int i=0; i<listOfCriminals.size();i++) {
			if(pa4.getName().equals(listOfCriminals.get(i))) {
				pa4.setCriminalRecord("not clear");
			}
			else {
				pa4.setCriminalRecord("clear");
			}
		}

		try {
			pa1.passportEligibility();
		} catch (Exception e) {
			logger.error("Error occurred while applying Passport for " + pa1.getName());
		}
		try {
			pa2.passportEligibility();
		} catch (Exception e) {
			logger.error("Error occurred while applying Passport for " + pa2.getName());
		}
		try {
			pa3.passportEligibility();
		} catch (Exception e) {
			logger.error("Error occurred while applying Passport for " + pa3.getName());
		}
		try {
			pa4.passportEligibility();
		} catch (Exception e) {
			logger.error("Error occurred while applying Passport for " + pa4.getName());
		}

	}

}
