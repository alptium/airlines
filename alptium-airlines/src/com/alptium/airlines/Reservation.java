package com.alptium.airlines;

public class Reservation  {
	
	private String departurePlace;
	private String arrivalPlace;
	private String dateOfDeparture;
	private String dateOfReturn;
	private int typeOfTrip;
	private int numOfPassangers;
	
	public Reservation (String departurePlace, String arrivalPlace, String dateOfDeparture, String dateOfReturn, int typeOfTrip, int numOfPassangers) {
		
		this.departurePlace = departurePlace;
		this.arrivalPlace = arrivalPlace;
		this.dateOfDeparture = dateOfDeparture;
		this.dateOfReturn = dateOfReturn;
		this.typeOfTrip = typeOfTrip;
		this.numOfPassangers = numOfPassangers;		
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
}