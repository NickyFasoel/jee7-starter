package com.realdolmen.course.repository;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.realdolmen.course.service.IMessageSupplier;

@Prude
public class FortuneRepo implements IMessageSupplier {

	private List<String> lstMessages = Arrays.asList(
		"Hallo",
		"Goedendag",
		"woot!"
	);

	@Override
	public String supplyRandomMessage() {
		return lstMessages.get(new Random().nextInt(lstMessages.size()));
	}
	
}
