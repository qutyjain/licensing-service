package com.books.registrations.services;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.registrations.clients.LibraryDiscoveryClient;
import com.books.registrations.model.Library;
import com.books.registrations.model.Register;
import com.books.registrations.repository.RegisterRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class RegisterService {
	@Autowired
	RegisterRepository registerRepository;

	@Autowired
	LibraryDiscoveryClient libraryDiscoveryClient;

	public List<Register> getBookByLicenseId(String register) {
		return registerRepository.getBookByRegisterId(register);

	}

	private void randomlyRunLong() {
		Random rand = new Random();
		int randomNum = rand.nextInt((3 - 1) + 1) + 1;
		if (randomNum == 3)
			sleep();
	}

	private void sleep() {
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@HystrixCommand
	public Register getRegisterWithLibInfo(String libraryId, String registerId,
			String clientType) {
		randomlyRunLong();
		Register register = registerRepository.findByregisterId(registerId);
		Library library = getLibraryInfo(libraryId);
		register.withLibraryContact(library.getLibraryContact())
				.withLibraryRegion(library.getRegion());
		return register;
	}

	private Library getLibraryInfo(String libraryId) {
		return libraryDiscoveryClient.getLibrary(libraryId);
	}

}
