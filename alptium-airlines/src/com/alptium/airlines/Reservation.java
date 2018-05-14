package com.alptium.airlines;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.alptium.airlines.Main.LuggageType;
import com.alptium.airlines.Main.MealType;
import com.alptium.airlines.Main.SeatType;

public class Reservation  {
	
	private int ReservationID; //reservationNumber
	private Client Client;
	private String tripType;
	private String isDisabledPerson;
	private boolean isChild;
	private String isPet;
	private LuggageType luggageType;
	private SeatType seatType;
	private MealType mealType;
	
	public Reservation(int reservationID, Client client, String tripType, String isDisabledPerson,
			boolean isChild, String isPet, LuggageType luggageType, SeatType seatType, MealType mealType) {
		ReservationID = reservationID;
		Client = client;
		this.tripType = tripType;
		this.isDisabledPerson = isDisabledPerson;
		this.isChild = isChild;
		this.isPet = isPet;
		this.luggageType = luggageType;
		this.seatType = seatType;
		this.mealType = mealType;
	}

	public Reservation() {
		super();
	}

	public int getReservationID() {
		return ReservationID;
	}

	public void setReservationID(int reservationID) {
		ReservationID = reservationID;
	}

	public Client getClient() {
		return Client;
	}

	public void setClient(Client client) {
		Client = client;
	}

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public String getIsDisabledPerson() {
		return isDisabledPerson;
	}

	public void setIsDisabledPerson(String isDisabledPerson) {
		this.isDisabledPerson = isDisabledPerson;
	}


	public String getIsPet() {
		return isPet;
	}

	public void setIsPet(String isPet) {
		this.isPet = isPet;
	}

	public LuggageType getLuggageType() {
		return luggageType;
	}

	public void setLuggageType(LuggageType luggageType) {
		this.luggageType = luggageType;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public MealType getMealType() {
		return mealType;
	}

	public void setMealType(MealType mealType) {
		this.mealType = mealType;
	}

	public boolean isChild() {
		return isChild;
	}

	/*Procedure for checking whether client is a child*/
	public void setChild (Client client) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Calendar cal = Calendar.getInstance();
		System.out.println(formatter.format(cal.getTime()));
		
		Date birthDate = client.getBirthDate();
		int birthYear = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(birthDate)).getYear();
		int yearsBetween = cal.get(Calendar.YEAR) - birthYear;
	
		if (yearsBetween > 5) {
			this.isChild = false;
		}
		
		this.isChild = true;
	}
	
}