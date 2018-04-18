package com.books.registrations.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.books.registrations.model.Register;

@Repository
public interface RegisterRepository extends CrudRepository<Register, String> {
public List<Register> getBookByRegisterId(String registerId);
}
	