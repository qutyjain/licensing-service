package com.books.registrations.clients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.books.registrations.model.Library;

@Component
public class LibraryDiscoveryClient {

	@Autowired
	private DiscoveryClient discoveryClient;
	@Autowired
	RestTemplate restTemplate;

	public Library getLibrary(String libraryId) {
		// RestTemplate restTemplate = new RestTemplate();
		List<ServiceInstance> instances = this.discoveryClient
				.getInstances("libraryservice");
		if (instances.size() == 0)
			return null;
		else {
			ResponseEntity<Library> response = restTemplate.exchange(
					"http://libraryservice/v/libraries/{libraryId}/library",
					org.springframework.http.HttpMethod.GET, null,
					Library.class, libraryId);
			return response.getBody();

		}
	}

}
