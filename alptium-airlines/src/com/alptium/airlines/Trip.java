package com.alptium.airlines;

public class Trip {
	
	private Reservation reservation;
	private Flight flight;
	
	public Trip(Reservation reservation, Flight flight) {
		this.reservation = reservation;
		this.flight = flight;
	}
	
	public Trip() {
		super();

	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	
	

}
