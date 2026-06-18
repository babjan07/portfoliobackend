package com.babjan.portfoliobackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.babjan.portfoliobackend.entity.Contact;
import com.babjan.portfoliobackend.repository.ContactRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactRepository repository;

    @PostMapping
    public Contact saveMessage(@RequestBody Contact contact) {
        return repository.save(contact);
    }
}