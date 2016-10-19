package com.realdolmen.course.domain;

import java.time.LocalTime;

import javax.persistence.Entity;

@Entity
public class VerifiedUser extends User {

	private String creditCard;
	
	private String verifiedId;
	
	private LocalTime verificationDate;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getVerifiedId() {
		return verifiedId;
	}

	public void setVerifiedId(String verifiedId) {
		this.verifiedId = verifiedId;
	}

	public LocalTime getVerificationDate() {
		return verificationDate;
	}

	public void setVerificationDate(LocalTime verificationDate) {
		this.verificationDate = verificationDate;
	}
	
	
}
