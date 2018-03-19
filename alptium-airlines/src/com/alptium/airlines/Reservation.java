package com.alptium.airlines;

public class Reservation  {
	
	private String departurePlace;
	private String arrivalPlace;
	private String dateOfDeparture;
	private String dateOfReturn;
	private int typeOfTrip;
	private int numOfPassangers;
	private int passportNumber;
	private String name;
	private String surname;
	private String reservationNumber;
	private String typeOfSeat;
	private String luggage;
	private String isChild;
	private String isPet;
	private String isPregnant;
	private String isDisabledPerson;
	private String meal;
	
	public Reservation (String departurePlace, String arrivalPlace, String dateOfDeparture, String dateOfReturn, int typeOfTrip, int numOfPassangers, int passportNumber) {
		
		this.departurePlace = departurePlace;
		this.arrivalPlace = arrivalPlace;
		this.dateOfDeparture = dateOfDeparture;
		this.dateOfReturn = dateOfReturn;
		this.typeOfTrip = typeOfTrip;
		this.numOfPassangers = numOfPassangers;	
		this.passportNumber = passportNumber;
	}	
	
	public Reservation(String name, String surname, String reservationNumber, String typeOfSeat, String luggage, String isChild, String isPet, String isPregnant, String isDisabledPerson, String meal) {
		this.name = name;
		this.surname = surname;
		this.reservationNumber = reservationNumber;
		this.typeOfSeat = typeOfSeat;
		this.luggage = luggage;
		this.isChild = isChild;
		this.isPet = isPet;
		this.isPregnant = isPregnant;
		this.isDisabledPerson = isDisabledPerson;
		this.meal = meal;
		
	}
	
	public String getDeparturePlace(){
		return departurePlace;
	}
	
	public String getArrivalPlace(){
		return arrivalPlace;
	}
	
	public String getDateOfDeparture(){
		return  dateOfDeparture;
	}
	
	public String getDateOfReturn(){
		return dateOfReturn;
	}
	
	public int getTypeOfTrip() {
		return typeOfTrip;
	}
	
	public int getNumOfPassangers() {
		return numOfPassangers;
	}
	
	public int getPassportNumber() {
		return passportNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getReservationNumber() {
		return reservationNumber;
	}
	
	public String getTypeOfSeat() {
		return typeOfSeat;
	}
	
	public String getLuggage() {
		return luggage;
	}
	
	public String getIsChild() {
		return isChild;
	}
	
	public String getIsPet() {
		return isPet;
	}
	
	public String getIsPregnant() {
		return isPregnant;
	}
	
	public String getIsDisabledPerson() {
		return isDisabledPerson;
	}
	
	public String getMeal() {
		return meal;
	}
	
}