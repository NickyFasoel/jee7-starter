package com.realdolmen.course.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Tweet {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public Long getId() {
		return id;
	}

	//@Past
	private LocalDateTime date;
	
	@NotNull
	@ManyToOne
	private User user;

	@Size(min = 2, max = 140)
	private String message;
	
	@Size(min = 1, groups = Tags.class)
	@ManyToMany
	private List<Tag> setTags;
	
	@Enumerated(EnumType.STRING)
	private Enum<Status> status;
	
	public Enum<Status> getStatus() {
		return status;
	}

	public void setStatus(Enum<Status> status) {
		this.status = status;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Tag> getSetTags() {
		return setTags;
	}

	public Tweet() { }
	
	public Tweet(User user, String message, Tag... setTags) {
		this.date = LocalDateTime.now();
		this.user = user;
		this.message = message;
		this.setTags = new ArrayList<Tag>(Arrays.asList(setTags));
		this.status = Status.ACTIVE;
	}

	
}
