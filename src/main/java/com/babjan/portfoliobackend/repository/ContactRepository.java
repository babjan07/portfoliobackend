package com.babjan.portfoliobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.babjan.portfoliobackend.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}