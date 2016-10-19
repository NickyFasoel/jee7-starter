package com.realdolmen;

import static org.junit.Assert.assertNotNull;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.realdolmen.course.service.FortuneService;
import com.realdolmen.course.service.PersonServiceBean;

public class FortuneServiceIntegrationTest {
	
	private Weld weld;
	private WeldContainer container;
	
	@Before
	public void init() {
		weld = new Weld();
		container = weld.initialize();
	}
	
	@After
	public void clean() {
		container.close();
	}
	
	@Test
	public void fortuneYieldsProfaneMessage() {
		FortuneService fs = container.instance().select(FortuneService.class).get();
		System.out.println(fs.fortune());
		assertNotNull(fs);
	}
}