package com.realdolmen.course.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class RegularUser extends User {

	@OneToOne
	private Profile profile;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Profile getProfile() {
		return profile;
	}
	
}
