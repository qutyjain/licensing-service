package com.thoughtmechanix.licenses.model;

public class License {
	String licenseType;
	String productName;
	String organizationId;
	String Id;
	
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getLicenseType() {
		return licenseType;
	}
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	
	public License withOrganizationId(String organizationId) {
		this.setOrganizationId(organizationId);
		return this;
	}
	
	public License withId(String id) {
		this.setId(Id);
		return this;
	}
	
	public License withProductName(String productName) {
		this.setProductName(productName);
		return this;
	}
	
	public License withLicenseType(String licenseType) {
		this.setLicenseType(licenseType);
		return this;
	}
	
	
}

