package com.books.registrations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Library {

	private String libraryId;
	
	private String libraryContact;
	
	private String region;

	public String getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryContact() {
		return libraryContact;
	}

	public void setLibraryName(String libraryContact) {
		this.libraryContact = libraryContact;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}
