package com.desktime.springjwt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desktime.springjwt.models.Service;
import com.desktime.springjwt.repository.ServiceRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class ObroController {
	
	@Autowired
	private ServiceRepository repository;
	
	@PostMapping("/service")
	public void ObroServiceController(@RequestBody Service service ){
		repository.save(service);
	}

}
