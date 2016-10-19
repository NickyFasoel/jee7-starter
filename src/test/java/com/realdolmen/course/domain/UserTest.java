package com.realdolmen.course.domain;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;

import com.realdolmen.course.utilities.persistence.JpaPersistenceTest;


public class UserTest extends JpaPersistenceTest {

	@Test
	public void verifiedUserCanBeInserted() throws Exception {
		EntityManager em = entityManager();
		VerifiedUser u = new VerifiedUser();
		u.setCreditCard("123creditcard");
		u.setEmail("fred@msn.com");
		u.setFirstName("Fred");
		u.setLastName("DaBeast");
		u.setPassword("fredALLSTAR321");
		u.setVerificationDate(LocalTime.now());
		u.setVerifiedId("id987");
		
		em.persist(u);
		
		
		
		assertNotNull(u.getId());
	}
	
	@Test
	public void regularUserCanBeInserted() throws Exception {
		EntityManager em = entityManager();
		
		RegularUser u = new RegularUser();
		u.setEmail("Roger@msn.com");
		u.setFirstName("Roger");
		u.setLastName("DeDonkere");
		u.setPassword("Roger1337");
		
		Profile p = new Profile();
		p.setAgeCategorie(AgeCategorie.OLD);
		p.setFamilyState(FamilyState.UNKNOWN);
		List<String> l = new ArrayList<String>();
		l.add("Sport");
		l.add("Kaarten");
		p.setLst(l);
		em.persist(p);
		u.setProfile(p);

		
		em.persist(u);
		
		
		
		assertNotNull(u.getId());
	}
	
	
}
