package com.alptium.airlines;

import java.util.Date;

public class Client {

	private int clientID;
	private String name;
	private String surname;
	private Date birthDate;
	private City birthPlace;
	private int JMBG;
	private char gender;
	private String address;
	private int phoneNumber;
	private int passportID;
	private String emailAddress;
	private String password;
	
	public Client (int clientID, String name, String surname, Date birthDate, City birthPlace, int JMBG, char gender, String address, String town, String country, int phoneNumber, int passportID, String emailAddress, String password) {
		
		this.clientID = clientID;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.JMBG =JMBG;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.passportID = passportID;
		this.emailAddress = emailAddress;
		this.password = password;
	} 


	public Client() {
		super();
	}
	
	
	public int getClientID() {
		return clientID;
	}


	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public City getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(City birthPlace) {
		this.birthPlace = birthPlace;
	}

	public int getJMBG() {
		return JMBG;
	}

	public void setJMBG(int jMBG) {
		JMBG = jMBG;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPassportID() {
		return passportID;
	}

	public void setPassportID(int passportID) {
		this.passportID = passportID;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
