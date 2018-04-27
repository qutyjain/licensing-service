package com.books.registrations.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.books.registrations.model.Register;
import com.books.registrations.services.RegisterService;
import com.books.registrations.utils.UserContextHolder;

@RestController
@RequestMapping(value = "/v/libraries/{libraryId}/registerId")
public class BookRegisterServiceController {
	private static final Logger logger = LoggerFactory
			.getLogger(BookRegisterServiceController.class);
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
		logger.debug("LicenseServiceController Correlation id: {}",
				UserContextHolder.getContext().getCorrelationId());
		System.out.println(UserContextHolder.getContext().getCorrelationId());
		return registerService.getRegisterWithLibInfo(libraryId, registerId,
				clientType);
	}

}
