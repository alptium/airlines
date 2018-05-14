package com.alptium.airlines;

public class City {

	private int cityID;
	private String cityName;
	private String country;
	
	
	public City(int cityID, String cityName, String country) {
		super();
		this.cityID = cityID;
		this.cityName = cityName;
		this.country = country;
	}
	
	public City() {
		super();
	}

	public int getCityID() {
		return cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
}
