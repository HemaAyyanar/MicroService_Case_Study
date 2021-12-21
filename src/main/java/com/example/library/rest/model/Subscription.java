package com.example.library.rest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import org.hibernate.annotations.JoinColumnOrFormula;

@Entity
public class Subscription {

	
	private String subscriberName;
	private Date dateSubscribed;
	private Date dateReturned;
	@Id
	private String Id;
	
	@ManyToOne(targetEntity = Book.class)
	@JoinColumn(name= "bookId")
	private Book book;

	public String getSubscriberName() {
		return subscriberName;
	}

	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	public Date getDateSubscribed() {
		return dateSubscribed;
	}

	public void setDateSubscribed(Date dateSubscribed) {
		this.dateSubscribed = dateSubscribed;
	}

	public Date getDateReturned() {
		return dateReturned;
	}

	public void setDateReturned(Date dateReturned) {
		this.dateReturned = dateReturned;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void setBookId(Integer bookId) {
		// TODO Auto-generated method stub
		
	}

	}
