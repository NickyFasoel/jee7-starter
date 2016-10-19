package com.realdolmen.course.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Profile {

	@Id 
	@GeneratedValue ( strategy = GenerationType.IDENTITY )
	private Long id;
	
	
	@Enumerated(EnumType.STRING)
	private Enum<AgeCategorie> ageCategorie;
	
	@ElementCollection
	private List<String> lstInterest = new ArrayList<>();

	
	@Enumerated(EnumType.STRING)
	private Enum<FamilyState> familyState;
	
	
	@OneToOne (mappedBy = "profile")
	RegularUser regUser;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void setFamilyState(Enum<FamilyState> familyState) {
		this.familyState = familyState;
	}

	public Enum<AgeCategorie> getAgeCategorie() {
		return ageCategorie;
	}


	public void setAgeCategorie(Enum<AgeCategorie> ageCategorie) {
		this.ageCategorie = ageCategorie;
	}


	public List<String> getLst() {
		return lstInterest;
	}


	public void setLst(List<String> lstInterest) {
		this.lstInterest = lstInterest;
	}


	public Enum<FamilyState> getFamilyState() {
		return familyState;
	}
}
