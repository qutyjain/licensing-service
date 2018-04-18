package com.books.registrations.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v/libraries/{libraryId}/registerId")
public class BookRegisterServiceController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	String getLicense(@PathVariable("libraryId")String libraryId) {
		return libraryId;
	}

}
