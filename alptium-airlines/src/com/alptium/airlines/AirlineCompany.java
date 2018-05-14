package com.alptium.airlines;

public class AirlineCompany {

	private int companyID;
	private String companyName;
	private City companyCity;
	
	public AirlineCompany(int companyID, String companyName, City companyCity) {
		super();
		companyID = companyID;
		this.companyName = companyName;
		this.companyCity = companyCity;
	}

	public AirlineCompany() {
		super();
	}

	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public City getCompanyCity() {
		return companyCity;
	}

	public void setCompanyCity(City companyCity) {
		this.companyCity = companyCity;
	}
	
	
}
