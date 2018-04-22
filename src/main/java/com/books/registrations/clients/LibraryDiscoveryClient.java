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

	public Library getLibrary(String libraryId) {
		RestTemplate restTemplate = new RestTemplate();
		List<ServiceInstance> instances = this.discoveryClient
				.getInstances("libraryservice");
		if (instances.size() == 0)
			return null;
		String serviceUri = String.format("%s/v/libraries/%s/library", instances
				.get(0).getUri().toString(), libraryId);

		ResponseEntity<Library> response = restTemplate.exchange(serviceUri,
				org.springframework.http.HttpMethod.GET, null, Library.class);

		return response.getBody();

	}

}
