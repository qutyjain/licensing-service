package com.books.registrations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "register")
public class Register {
	
	@Id
	@Column(name = "register_id", nullable = false)
	private String registerId;

	@Column(name = "register_type", nullable = false)
	private String registerType;

	@Column(name = "book_name", nullable = false)
	private String bookName;

	@Column(name = "library_id", nullable = false)
	private String libraryId;

	@Transient
	private String libraryContact;

	@Transient
	private String libraryRegion;



	public String getRegisterId() {
		return registerId;
	}

	public void setrRegisterId(String registerId) {
		this.registerId = registerId;
	}

	public String getRegisterType() {
		return registerType;
	}

	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}

	public Register withLibraryId(String libraryId) {
		this.setLibraryId(libraryId);
		return this;
	}

	public String getLibraryContact() {
		return libraryContact;
	}

	public void setLibraryContact(String libraryContact) {
		this.libraryContact = libraryContact;
	}

	public String getLibraryRegion() {
		return libraryRegion;
	}

	public void setLibraryRegion(String libraryRegion) {
		this.libraryRegion = libraryRegion;
	}

	public Register withRegisterId(String registerId) {
		this.setrRegisterId(registerId);
		return this;
	}

	public Register withBookName(String bookName) {
		this.setBookName(bookName);
		return this;
	}

	public Register withRegisterType(String registerType) {
		this.setRegisterType(registerType);
		return this;
	}

	public Register withLibraryContact(String libraryContact) {
		this.setLibraryContact(libraryContact);
		return this;
	}

	public Register withLibraryRegion(String libraryRegion) {
		this.setLibraryRegion(libraryRegion);
		return this;
	}

}
