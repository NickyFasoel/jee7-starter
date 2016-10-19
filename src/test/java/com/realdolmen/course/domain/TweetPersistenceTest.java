package com.realdolmen.course.domain;

import java.util.Set;

import javax.persistence.EntityManager;

import org.junit.Ignore;
import org.junit.Test;

import com.realdolmen.course.utilities.persistence.JpaPersistenceTest;

public class TweetPersistenceTest extends JpaPersistenceTest {
	
	/*
	@Test
	public void tweetCanBeRetrieved() throws Exception {
		EntityManager em = entityManager();
		Tweet tweet = em.find(Tweet.class, 3000l);
		assertEquals("I see riders on the storm.", tweet.getMessage());
		assertEquals("Jim", tweet.getUserName());
	}
	
	@Test
	public void tweetCanBeInserted() throws Exception {
		EntityManager em = entityManager();
		Tweet tweet = new Tweet("Freddy", "42 is the answer!");
		em.persist(tweet);
		Tweet m = (Tweet) em.createNativeQuery("SELECT * From realdolmen.tweet WHERE userName = '" + tweet.getUserName()
												+ "' AND message = '" + tweet.getMessage() + "';", Tweet.class).getSingleResult();
		assertEquals(tweet, m);
	}
	
	@Test
	public void tweetHasDate() throws Exception {
		EntityManager em = entityManager();
		Tweet tweet = new Tweet("Batman", "Molded by darkness!");
		em.persist(tweet);
		Tweet m = (Tweet) em.createNativeQuery("SELECT * From realdolmen.tweet WHERE userName = '" + tweet.getUserName()
												+ "' AND message = '" + tweet.getMessage() + "';", Tweet.class).getSingleResult();
		assertNotNull(tweet.getDate());
	}
	
	
	@Test
	public void tweetTagsCanBeInserted() throws Exception {
		EntityManager em = entityManager();  
		Tweet tweet = new Tweet("Taggert", "ZOiezo", "haha", "ha", "hahaaaaa");
		
		em.persist(tweet);
		Tweet m = (Tweet) em.createNativeQuery("SELECT * From realdolmen.tweet WHERE userName = '" + tweet.getUserName()
												+ "' AND message = '" + tweet.getMessage() + "';", Tweet.class).getSingleResult();
		assertEquals(m.getSetTags().size(), tweet.getSetTags().size());
	}
	
	
	@Test
	public void tweetCanBeInserted() throws Exception {
		EntityManager em = entityManager();
		User u = new User("Bob", "fm", "root", "bob@msn.com");
		em.persist(u);
		
		Tag t = new Tag();
		t.setName("nieuwe tag!");
		em.persist(t);
		
		Tag e = new Tag();
		e.setName("tweede tag!");
		em.persist(e);
		
		Tweet cccc = new Tweet(u, "message", t, e);
		em.persist(cccc);
		
		assertNotNull(cccc.getId());
	}
	*/
}
