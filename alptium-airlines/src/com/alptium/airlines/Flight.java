package com.alptium.airlines;

import java.util.Date;

public class Flight {

	private int flightID;
	private AirlineCompany company;
	private City departureCity;
	private City arrivalCity;
	private Date flightDate;
	private Date flightTime;
	private String planeType;
	private int numberSeats;
	private int numberPassengers = 0;
	private double priceEconomy;
	private double priceBussiness;
	private double percentageChild;
	private double pricePet;
	private double priceLuggage;
	private double flightDuration;
	
	
	public Flight(int flightID, AirlineCompany company, City departureCity, City arrivalCity, Date flightDate,
			Date flightTime, String planeType, int numberSeats, int numberPassengers, double priceEconomy,
			double priceBussiness, double percentageChild, double pricePet, double priceLuggage,
			double flightDuration) {
		super();
		this.flightID = flightID;
		this.company = company;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.flightDate = flightDate;
		this.flightTime = flightTime;
		this.planeType = planeType;
		this.numberSeats = numberSeats;
		this.numberPassengers = numberPassengers;
		this.priceEconomy = priceEconomy;
		this.priceBussiness = priceBussiness;
		this.percentageChild = percentageChild;
		this.pricePet = pricePet;
		this.priceLuggage = priceLuggage;
		this.flightDuration = flightDuration;
	}

	public Flight() {
		super();
	}

	public int getFlightID() {
		return flightID;
	}

	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}

	public AirlineCompany getCompany() {
		return company;
	}

	public void setCompany(AirlineCompany company) {
		this.company = company;
	}

	public City getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(City departureCity) {
		this.departureCity = departureCity;
	}

	public City getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(City arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public Date getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(Date flightTime) {
		this.flightTime = flightTime;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public int getNumberSeats() {
		return numberSeats;
	}

	public void setNumberSeats(int numberSeats) {
		this.numberSeats = numberSeats;
	}

	public int getNumberPassengers() {
		return numberPassengers;
	}

	public void setNumberPassengers(int numberPassengers) {
		this.numberPassengers = numberPassengers;
	}

	public double getPriceEconomy() {
		return priceEconomy;
	}

	public void setPriceEconomy(double priceEconomy) {
		this.priceEconomy = priceEconomy;
	}

	public double getPriceBussiness() {
		return priceBussiness;
	}

	public void setPriceBussiness(double priceBussiness) {
		this.priceBussiness = priceBussiness;
	}

	public double getPercentageChild() {
		return percentageChild;
	}

	public void setPercentageChild(double percentageChild) {
		this.percentageChild = percentageChild;
	}

	public double getPricePet() {
		return pricePet;
	}

	public void setPricePet(double pricePet) {
		this.pricePet = pricePet;
	}

	public double getPriceLuggage() {
		return priceLuggage;
	}

	public void setPriceLuggage(double priceLuggage) {
		this.priceLuggage = priceLuggage;
	}

	public double getFlightDuration() {
		return flightDuration;
	}

	public void setFlightDuration(double flightDuration) {
		this.flightDuration = flightDuration;
	}

	
}
