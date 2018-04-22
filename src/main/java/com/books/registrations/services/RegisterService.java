package com.books.registrations.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.registrations.clients.LibraryDiscoveryClient;
import com.books.registrations.model.Library;
import com.books.registrations.model.Register;
import com.books.registrations.repository.RegisterRepository;

@Service
public class RegisterService {
	@Autowired
	RegisterRepository registerRepository;

	@Autowired
	LibraryDiscoveryClient libraryDiscoveryClient;

	public List<Register> getBookByLicenseId(String register) {
		return registerRepository.getBookByRegisterId(register);

	}

	public Register getRegisterWithLibInfo(String libraryId, String registerId,String clientType) {
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
