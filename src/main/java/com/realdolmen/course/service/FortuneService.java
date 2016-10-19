package com.realdolmen.course.service;

import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.event.Event;

import com.realdolmen.course.repository.Profane;
import com.realdolmen.course.repository.Prude;

@Named("batman")
public class FortuneService  {
	
	@Inject @Profane
	protected IMessageSupplier message;
	
	@Inject @Batman
	private Event<String> shithappened;
	
	public String fortune() {
		String a = message.supplyRandomMessage();
		if ( a.toLowerCase().contains("shit") ) {
			shithappened.fire(a);
		}
		return a;
	}

}
