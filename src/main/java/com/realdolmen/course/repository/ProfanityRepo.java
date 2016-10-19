package com.realdolmen.course.repository;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.realdolmen.course.service.IMessageSupplier;

@Profane
public class ProfanityRepo implements IMessageSupplier{

	private List<String> lstMessages = Arrays.asList(
			"Fuck You!",
			"Fooraap",
			"Kloot",
			"Shit you did it again!",
			"Shittier"
		);
	
	
	
	@Override 
	public String supplyRandomMessage() {
		return lstMessages.get(new Random().nextInt(lstMessages.size()));
		
	}
	
}
