package com.books.registrations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "register")
public class Register {

	@Column(name = "register_type", nullable = false)
	private String registerType;

	@Column(name = "book_name", nullable = false)
	private String bookName;

	@Column(name = "library_id", nullable = false)
	private String libraryId;

	@Id
	@Column(name = "register_id", nullable = false)
	private String registerId;

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

}
