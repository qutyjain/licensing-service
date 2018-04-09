package com.thoughtmechanix.licenses.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v/organizations/{organizationId}/licenses")
public class LicenseServiceController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	String getLicense(@PathVariable("organizationId")String organizationId) {
		return organizationId;
	}

}
