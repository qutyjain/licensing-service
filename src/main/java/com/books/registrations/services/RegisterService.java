package com.books.registrations.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.registrations.model.Register;
import com.books.registrations.repository.RegisterRepository;

@Service
public class RegisterService {
	@Autowired
	RegisterRepository registerRepository;

	public List<Register> getBookByLicenseId(String register) {
		return registerRepository.getBookByRegisterId(register);

	}

}
