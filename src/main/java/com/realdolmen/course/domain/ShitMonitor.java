package com.realdolmen.course.domain;

import javax.enterprise.event.Observes;

import com.realdolmen.course.service.Batman;

public class ShitMonitor {
	
	public void getUpdated(@Observes @Batman String message) {
		System.out.println("Shit happened in this sentence " + message);
	}
}
