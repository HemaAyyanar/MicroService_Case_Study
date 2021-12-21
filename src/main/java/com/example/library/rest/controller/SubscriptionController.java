package com.example.library.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.example.library.rest.model.BookSubscription;
import com.example.library.rest.model.Subscription;
import com.example.library.rest.service.SubscriptionService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/library/subscription")
public class SubscriptionController {
	
	@Autowired
	SubscriptionService subscriptionService;

	@GetMapping
	public List<Subscription> getAllsubscribers() {
		return subscriptionService.fetchAllSubscribers();
	}
	
	@PostMapping("/subscription")
	public Subscription saveSubscription(@RequestBody BookSubscription subscription ) throws Exception {
         return subscriptionService.saveSubscription(subscription);
	}

}
