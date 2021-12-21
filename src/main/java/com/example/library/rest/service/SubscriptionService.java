package com.example.library.rest.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.rest.model.Book;
import com.example.library.rest.model.BookSubscription;
import com.example.library.rest.model.Subscription;
import com.example.library.rest.repository.SubscriptionRepository;


@Service
public class SubscriptionService {
	
	@Autowired
	SubscriptionRepository subscriptionRepository;
	
	@Autowired
	BookService bookService;

	
	public List<Subscription> fetchAllSubscribers() {
		return subscriptionRepository.findAll();
	}

	@Transactional
	public Subscription saveSubscription(BookSubscription bookSubcription) throws Exception {
		
		Book book=bookService.getBook(bookSubcription.getBookId());
		// TODO Auto-generated method stub
		if(book.getCopiesAvailable() == 0 ) {
			throw new Exception("Book is not available for subscription");
		}
		
			Subscription subscription= new Subscription();
			subscription.setId(bookSubcription.getBookId().toString());
			subscription.setSubscriberName(bookSubcription.getSubscriberName());
		    subscription.setDateSubscribed(bookSubcription.getDateSubscribed());
		    subscription.setBookId(bookSubcription.getBookId());
		    
		
		     return this.subscriptionRepository.save(subscription);
	}
	
}

