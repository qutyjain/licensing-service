package com.books.registrations.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.books.registrations.model.Register;
import com.books.registrations.services.RegisterService;

@RestController
@RequestMapping(value = "/v/libraries/{libraryId}/registerId")
public class BookRegisterServiceController {

	@Autowired
	RegisterService registerService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	String getLicense(@PathVariable("libraryId") String libraryId) {
		return libraryId;
	}

	@RequestMapping(value = "/{registerId}/{clientType}", method = RequestMethod.GET)
	public Register getRegisterWithLibrary(
			@PathVariable("libraryId") String libraryId,
			@PathVariable("registerId") String registerId,
			@PathVariable("clientType") String clientType) {
		return registerService.getRegisterWithLibInfo(libraryId, registerId, clientType);
	}

}
