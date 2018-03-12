package com.alptium.airlines;

public class MyReservation {

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
	
	public MyReservation(String name, String surname, String reservationNumber, String typeOfSeat, String luggage, String isChild, String isPet, String isPregnant, String isDisabledPerson, String meal) {
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
