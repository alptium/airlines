package com.alptium.airlines;

public class Client {

	private String name;
	private String surname;
	private String dateOfBirth;
	private String placeOfBirth;
	private int JMBG;
	private char gender;
	private String address;
	private String town;
	private String country;
	private int phoneNumber;
	private int passportID;
	private String emailAddress;
	
	public Client (String name, String surname, String dateOfBirth, String placeOfBirth, int JMBG, char gender, String address, String town, String country, int phoneNumber, int passportID, String emailAddress) {
		
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.JMBG =JMBG;
		this.gender = gender;
		this.address = address;
		this.town = town;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.passportID = passportID;
		this.emailAddress = emailAddress;
	
	} 
	
		public String getName() {
			return name;
	
	}	public String getSurname() {
			return surname;
		
	}	public String getDateOfBirth() {
			return dateOfBirth;
		
	}	public String getPlaceOfBirth() {
			return placeOfBirth;
		
	}	public int JMBG() {
			return JMBG;
			
	}	public char getGender()	{
			return gender;
			
	}	public String getAddress()	{
			return address;
		
	}	public String getTown()	{
			return town;
			
	}	public String getCountry()	{
			return country;
			
	}	public int getPhoneNumber()	{
			return phoneNumber;
			
	}	public int getPassportID()	{
			return passportID;
			
	}	public String getEmailAddress()	{
			return emailAddress;
			
	}
	
}
