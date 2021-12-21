package com.example.library.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.library.rest.model.Subscription;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription,String> {
		

}
