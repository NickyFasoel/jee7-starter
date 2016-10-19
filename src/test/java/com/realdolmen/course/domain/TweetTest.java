package com.realdolmen.course.domain;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ConstraintViolation;
import javax.validation.ValidatorFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import javax.validation.groups.*;

public class TweetTest {

	private ValidatorFactory fac;
	private Validator val;
	
	@Before
	public void init() {
		fac = Validation.buildDefaultValidatorFactory();
		val = fac.getValidator();
	}
	
	@After
	public void clean() {
		fac.close();
	}
	
	@Test
	public void messageMustBeLongEnough() {
		Tweet t = new Tweet(null, "message");
		Set<ConstraintViolation<Tweet>> violations = val.validate(t, Tags.class, Default.class);
		assertEquals(2, violations.size());
	}
	
}
