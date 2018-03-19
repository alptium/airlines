package com.alptium.airlines;

import java.sql.*;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
		
		System.out.println("Welcome to Alptium Airlines application");
		System.out.println("Now, you'll have to choose the option you need!");
		System.out.println("If you want to go to < FLIGHTS > page, enter F");
		System.out.println("If you want to go to < MAKE RESERVATIONS > page, enter R");
		System.out.println("If you want to go to < MY RESERVATION > page, enter MR");
		System.out.println("If you want to go to < INFORMATION > page, enter I");
		System.out.println("If you want to go to < CLIENTS > page, enter C");

		System.out.println("Please, enter the path for your choise!");
		
		String choise = sc.next();
			  
		if(choise.equals("F") || choise.equals("f")) {
			 runDemoFlight(); 
		} else if(choise.equals("R") || choise.equals("r") ) {
			 runDemoReservation();
		} else if(choise.equals("MR") || choise.equals("mr")) {
			 runDemoMyReservation();		
		} else if(choise.equals("I") || choise.equals("i")) {
			 runDemoInformation();
		} else if(choise.equals("C") || choise.equals("c")) {
			 runDemoClient();
		} else while (!choise.equals("F") && !choise.equals("f") && !choise.equals("R") && !choise.equals("r") && !choise.equals("MR") && !choise.equals("mr") && !choise.equals("I") && !choise.equals("i") && !choise.equals("C") && !choise.equals("c")) {
			System.out.println("THE PATH YOU ENTERED IS INCORRECT!");
			
			 System.out.println("Please, TRY AGAIN");
			 System.out.println();
			 choise = sc.next();
		 }
		 
	}		
		
}

	private static void runDemoFlight() {

		System.out.println("Welcome to the page FLIGHTS");
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("You can choose another option if you need!");
			System.out.println("If you want to go to < FLIGHTS > page, enter F");
			System.out.println("If you want to go to < MAKE RESERVATIONS > page, enter R");
			System.out.println("If you want to go to < MY RESERVATION > page, enter MR");
			System.out.println("If you want to go to < INFORMATION > page, enter I");
			System.out.println("If you want to go to < CLIENTS > page, enter C");

			System.out.println("Please, enter the path for your choise!");
			
			String choise = sc.next();
				  
			if(choise.equals("F") || choise.equals("f")) {
				 runDemoFlight(); 
			} else if(choise.equals("R") || choise.equals("r") ) {
				 runDemoReservation();
			} else if(choise.equals("MR") || choise.equals("mr")) {
				 runDemoMyReservation();		
			} else if(choise.equals("I") || choise.equals("i")) {
				 runDemoInformation();
			} else if(choise.equals("C") || choise.equals("c")) {
				 runDemoClient();
			} else while (!choise.equals("F") && !choise.equals("f") && !choise.equals("R") && !choise.equals("r") && !choise.equals("MR") && !choise.equals("mr") && !choise.equals("I") && !choise.equals("i") && !choise.equals("C") && !choise.equals("c")) {
				System.out.println("THE PATH YOU ENTERED IS INCORRECT!");
				
				 System.out.println("Please, TRY AGAIN");
				 System.out.println();
				 choise = sc.next();
			 }
			 
		}		

	}
	
	private static void runDemoReservation() {
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "";
		 
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url,user, password);

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
		try {
		Statement stt = connection.createStatement();
        
		stt.execute("CREATE DATABASE IF NOT EXISTS airlines");
		stt.execute("USE airlines");
		
		System.out.println("Your database airlines is created successfully! ");
		System.out.println("============================================== ");

		
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		
		try {
			Statement stt = connection.createStatement();
	        
			stt.execute("CREATE TABLE IF NOT EXISTS reservation (" +
					"id BIGINT NOT NULL AUTO_INCREMENT,"
					+ "departurePlace VARCHAR(25),"
					+ "arrivalPlace VARCHAR(25),"
					+ "dateOfDeparture VARCHAR(10),"
					+ "dateOfReturn VARCHAR(10),"
					+ "typeOfTrip INT,"
					+ "numOfPassangers INT,"
					+ "passportNumber INT,"
					+ "PRIMARY KEY(id)"					
					+ ")");
						
			System.out.println("Your table reservation is created successfully! ");
			
			} catch (SQLException e) {

				System.out.println(e.getMessage());
			}
	 
		System.out.println("Welcome to the page RESERVATIONS");
		System.out.println("Follow the instructions, find and reserve your flight");
		
		
		try(Scanner sc = new Scanner(System.in)) {
			
			 	String departurePlace;
			 	String arrivalPlace;
			 	String dateOfDeparture;
			 	String dateOfReturn = "";
			 	int typeOfTrip;
			 	int numOfPassangers;
			 	int passportNumber;
			 				
				System.out.println("Please, enter the departure place:");
				departurePlace = sc.next();				
				System.out.println("Please, enter the arrival place:");
				arrivalPlace =sc.next();
				System.out.println("Please, choose the flight:");
				System.out.println("If you want round trip press 1, if you want one way trip press 2:");
				typeOfTrip = sc.nextInt();			
				System.out.println("Please, enter the date of departure in format dd/MM/yyyy:");				
				dateOfDeparture = sc.next();		
								 
				 if (typeOfTrip == 1) {
					 System.out.println("Please, enter the date of return in format dd/MM/yyyy:");
					 dateOfReturn = sc.next();
				 }
				 
				System.out.println("Please, enter the number of passangers");
				numOfPassangers = sc.nextInt();	
				System.out.println("Please, enter the passport number:");				
				passportNumber = sc.nextInt();
				
				Reservation reservation = new Reservation(departurePlace, arrivalPlace, dateOfDeparture, dateOfReturn, typeOfTrip, numOfPassangers, passportNumber);
				try {
					
				String sql = "insert into reservation "
						+ " (departurePlace, arrivalPlace, dateOfDeparture, dateOfReturn, typeOfTrip, numOfPassangers, passportNumber)" + " values (?, ?, ?, ?, ?, ?, ?)";
				
				PreparedStatement prep = connection.prepareStatement(sql);
				
				prep.setString(1, reservation.getDeparturePlace());
				prep.setString(2, reservation.getArrivalPlace());
				prep.setString(3, reservation.getDateOfDeparture());
				prep.setString(4, reservation.getDateOfReturn());
				prep.setInt(5, reservation.getTypeOfTrip());
				prep.setInt(6, reservation.getNumOfPassangers());
				prep.setInt(7, reservation.getPassportNumber());
				
				prep.executeUpdate();
				} catch (SQLException e) {

					System.out.println(e.getMessage());
				}
				System.out.println("You have successfully booked your flight. Your booking details are:");
				System.out.println("Flight from:" + reservation.getDeparturePlace());
				System.out.println("Flight to:" + reservation.getArrivalPlace());
				System.out.println("Date of departure:" + reservation.getDateOfDeparture());
				System.out.println("Date of return:" + reservation.getDateOfReturn());
				System.out.println("Number of passangers:" + reservation.getNumOfPassangers());
				System.out.println("Your passport number is: " + reservation.getPassportNumber());

				System.out.println("=====================================================");
				System.out.println("If you want to go to Confirm and Save, enter S and you will be forwarded to My Reservation page");
				System.out.println("If you want to change your reservation enter U");
				System.out.println("If you want to delete your reservation enter D");

				String choise = sc.next();
				  
				if(choise.equals("S") || choise.equals("s")) {
					runDemoMyReservation(); 
				} else if(choise.equals("U") || choise.equals("u")) {
					
					try(Scanner update = new Scanner(System.in)) {
				        
						Statement stt = connection.createStatement();
			            
						stt.execute("USE airlines");				
				           
						System.out.println("Please, enter the departure place:");
						departurePlace = update.next();				
						System.out.println("Please, enter the arrival place:");
						arrivalPlace =update.next();
						System.out.println("Please, choose the flight:");
						System.out.println("If you want round trip press 1, if you want one way trip press 2:");
						typeOfTrip = update.nextInt();			
						System.out.println("Please, enter the date of departure in format dd/MM/yyyy:");				
						dateOfDeparture = update.next();		
										 
						 if (typeOfTrip == 1) {
							 System.out.println("Please, enter the date of return in format dd/MM/yyyy:");
							 dateOfReturn = update.next();
						 }
						 
						System.out.println("Please, enter the number of passangers");
						numOfPassangers = update.nextInt();	
						System.out.println("Please, enter the passport number:");				
						passportNumber = update.nextInt();	
			            
						String sql = "UPDATE reservation SET departurePlace = ?, arrivalPlace = ?, typeOfTrip = ?, dateOfDeparture = ?, dateOfReturn = ?, numOfPassangers = ?, passportNumber = ?"
								+ " WHERE passportNumber = '"  + passportNumber + "'";

						PreparedStatement prep = connection.prepareStatement(sql);

			            prep.setString(1, departurePlace);
			            prep.setString(2, arrivalPlace);
			            prep.setInt(3, typeOfTrip);
			            prep.setString(4, dateOfDeparture);
			            prep.setString(5, dateOfReturn);
			            prep.setInt(6, numOfPassangers);
			            prep.setInt(7, passportNumber);

			            prep.executeUpdate();
			            
			            System.out.println("Your reservation has been changed!");
			            
					} catch (SQLException e) {
						System.out.println(e.getMessage());						
					}
										
				} else if (choise.equals("D") || choise.equals("d")) {
					
					try(Scanner delete = new Scanner(System.in)) {
				        
						Statement stt = connection.createStatement();
			            
						stt.execute("USE airlines");				
				           
						System.out.println("Please, enter the passport number:");				
						passportNumber = delete.nextInt();	
			            
						String sql = "DELETE FROM reservation WHERE passportNumber = '"  + passportNumber + "'";

						PreparedStatement prep = connection.prepareStatement(sql);

			            prep.executeUpdate();
			            System.out.println("Your reservation has been deleted!");
			            
					} catch (SQLException e) {
						System.out.println(e.getMessage());						
					}
					
				} else {
			
					try(Scanner scc = new Scanner(System.in)) {
			
					System.out.println("You can choose another option if you need!");
					System.out.println("If you want to go to < FLIGHTS > page, enter F");
					System.out.println("If you want to go to < MAKE RESERVATIONS > page, enter R");
					System.out.println("If you want to go to < MY RESERVATION > page, enter MR");
					System.out.println("If you want to go to < INFORMATION > page, enter I");
					System.out.println("If you want to go to < CLIENTS > page, enter C");
	
					System.out.println("Please, enter the path for your choise!");
					
					String choise1 = scc.next();
						  
					if(choise1.equals("F") || choise1.equals("f")) {
						 runDemoFlight(); 
					} else if(choise1.equals("R") || choise1.equals("r") ) {
						 runDemoReservation();
					} else if(choise1.equals("MR") || choise1.equals("mr")) {
						 runDemoMyReservation();		
					} else if(choise1.equals("I") || choise1.equals("i")) {
						 runDemoInformation();
					} else if(choise1.equals("C") || choise1.equals("c")) {
						 runDemoClient();
					} else while (!choise1.equals("F") && !choise1.equals("f") && !choise1.equals("R") && !choise1.equals("r") && !choise1.equals("MR") && !choise1.equals("mr") && !choise1.equals("I") && !choise1.equals("i") && !choise1.equals("C") && !choise1.equals("c")) {
						System.out.println("THE PATH YOU ENTERED IS INCORRECT!");
						
						 System.out.println("Please, TRY AGAIN");
						 System.out.println();
						 choise1 = scc.next();
					}
					}			 
	
				}		
		}
	}	
	private static void runDemoMyReservation() {

		System.out.println("Welcome to the page MY RESERVATIONS");
		System.out.println("Here, you can manage and complete the reservation you had alredy made");
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter your name");
			String name = sc.next();
			
			System.out.println("Enter your surname");
			String surname = sc.next();
			
			System.out.println("Enter the number of your reservation");
			String reservationNumber = sc.next();
			
			System.out.println("Please choose a type of seat you wish to reserve entering the number of your option!");
			System.out.println("Enter 1 if you want a seat with more space for your legs");
			System.out.println("Enter 2 if you want the priority area");
			System.out.println("Enter 3 if you want a regular seat");
			String typeOfSeat = sc.next();
			
			System.out.println("If you plan to have more luggage than your card price covers answer with yes. If don't, answer with no!");
			String luggage = sc.next();
			
			System.out.println("Is any person covered by your reservation a child? yes/no");
			String isChild = sc.next();
			
			System.out.println("Do you bring any pet with you? yes/no");
			String isPet = sc.next();
			
			System.out.println("Is any person covered by your reservation pregnant? yes/no");
			String isPregnant = sc.next();
			
			System.out.println("Is any person covered by your reservation a disabled person? yes/no");
			String isDisabledPerson = sc.next();
			
			System.out.println("Do you want to take some meals during the flight? yes/no");
			String meal = sc.next();

			Reservation myReservation = new Reservation(name, surname, reservationNumber, typeOfSeat, luggage, isChild, isPet, isPregnant, isDisabledPerson, meal);
			
			System.out.println("You registration is done. Plese check the data once more!");
			System.out.println();
			System.out.println("Client name and surname: " + myReservation.getName() + "\t" + myReservation.getSurname());
			System.out.println("Number of your reservation: " + myReservation.getReservationNumber());
			System.out.println("Type of seat: " + myReservation.getTypeOfSeat());
			System.out.println("Do you plan more luggage than covered? "+ myReservation.getLuggage());
			System.out.println("Dou you bring children? " + myReservation.getIsChild());
			System.out.println("Is any person covered by your reservation pregnant? " + myReservation.getIsPregnant());
			System.out.println("Is any person covered by your reservation a disabled person? " + myReservation.getIsDisabledPerson());
			System.out.println("Applied for a meal? " + myReservation.getMeal());
			System.out.println();
			System.out.println();
		
		try(Scanner scc = new Scanner(System.in)) {
			
			System.out.println("You can choose another option if you need!");
			System.out.println("If you want to go to < FLIGHTS > page, enter F");
			System.out.println("If you want to go to < MAKE RESERVATIONS > page, enter R");
			System.out.println("If you want to go to < MY RESERVATION > page, enter MR");
			System.out.println("If you want to go to < INFORMATION > page, enter I");
			System.out.println("If you want to go to < CLIENTS > page, enter C");

			System.out.println("Please, enter the path for your choise!");
			
			String choise = scc.next();
				  
			if(choise.equals("F") || choise.equals("f")) {
				 runDemoFlight(); 
			} else if(choise.equals("R") || choise.equals("r") ) {
				 runDemoReservation();
			} else if(choise.equals("MR") || choise.equals("mr")) {
				 runDemoMyReservation();		
			} else if(choise.equals("I") || choise.equals("i")) {
				 runDemoInformation();
			} else if(choise.equals("C") || choise.equals("c")) {
				 runDemoClient();
			} else while (!choise.equals("F") && !choise.equals("f") && !choise.equals("R") && !choise.equals("r") && !choise.equals("MR") && !choise.equals("mr") && !choise.equals("I") && !choise.equals("i") && !choise.equals("C") && !choise.equals("c")) {
				System.out.println("THE PATH YOU ENTERED IS INCORRECT!");
				
				 System.out.println("Please, TRY AGAIN");
				 System.out.println();
				 choise = scc.next();
			 }		
		}
		
	}
		
}
	
	private static void runDemoInformation() {

		System.out.println("Welcome to the page INFORMATION");
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("You can choose another option if you need!");
			System.out.println("If you want to go to < FLIGHTS > page, enter F");
			System.out.println("If you want to go to < MAKE RESERVATIONS > page, enter R");
			System.out.println("If you want to go to < MY RESERVATION > page, enter MR");
			System.out.println("If you want to go to < INFORMATION > page, enter I");
			System.out.println("If you want to go to < CLIENTS > page, enter C");

			System.out.println("Please, enter the path for your choise!");
			
			String choise = sc.next();
				  
			if(choise.equals("F") || choise.equals("f")) {
				 runDemoFlight(); 
			} else if(choise.equals("R") || choise.equals("r") ) {
				 runDemoReservation();
			} else if(choise.equals("MR") || choise.equals("mr")) {
				 runDemoMyReservation();		
			} else if(choise.equals("I") || choise.equals("i")) {
				 runDemoInformation();
			} else if(choise.equals("C") || choise.equals("c")) {
				 runDemoClient();
			} else while (!choise.equals("F") && !choise.equals("f") && !choise.equals("R") && !choise.equals("r") && !choise.equals("MR") && !choise.equals("mr") && !choise.equals("I") && !choise.equals("i") && !choise.equals("C") && !choise.equals("c")) {
				System.out.println("THE PATH YOU ENTERED IS INCORRECT!");
				
				 System.out.println("Please, TRY AGAIN");
				 System.out.println();
				 choise = sc.next();
			 }
			 
		}		

	}
	
	private static void runDemoClient() {

		System.out.println("Welcome to the page CLIENTS");
		
			try(Scanner sc = new Scanner(System.in)) {
			
				 System.out.println("Enter your name: ");
				 String name = sc.next();			 
				 System.out.println("Enter your surname: ");
				 String surname = sc.next();	 
				 System.out.println("Enter your date and year of birth in format of dd/MM/yyyy: ");
				 String dateOfBirth = sc.next();	 
				 System.out.println("Enter your please of birth: ");
				 String placeOfBirth = sc.next(); 
				 System.out.println("Enter your JMBG number: ");
				 int JMBG = sc.nextInt();
				 System.out.println("Enter your gender: ");
				 char gender = sc.next().charAt(0);
				 System.out.println("Enter your home address: ");
				 String address = sc.next(); 
				 System.out.println("Enter your town: ");
				 String town = sc.next();
				 System.out.println("Enter your country: ");
				 String country = sc.next();
				 System.out.println("Enter your phone number: ");
				 int phoneNumber = sc.nextInt();
				 System.out.println("Enter your passport ID: ");
				 int passportID = sc.nextInt();
				 System.out.println("Enter your email address: ");
				 String emailAddress = sc.next();
				 
				 Client client = new Client (name, surname, dateOfBirth, placeOfBirth, JMBG, gender, address, town, country, phoneNumber, passportID, emailAddress);
				 
				 System.out.println("You have been sucessfully added personal information to your reservation!");
				 System.out.println("Before you continue, please check your data once again.");
				 System.out.println("Name and surname: " + client.getName() + " " + client.getSurname());
				 System.out.println("Your date and place of birth: " + client.getDateOfBirth() + " " + client.getPlaceOfBirth());
				 System.out.println("Your JMBG and gender: " + client.JMBG() + " " + client.getGender());
				 System.out.println("Your address, town and country: " + client.getAddress() + " " + client.getTown() + " " + client.getCountry());
				 System.out.println("Your phone number and email address: " + client.getPassportID() + " " + client.getEmailAddress());
			
				 System.out.println("========================================================================");
				 
				 System.out.println("You can choose another option if you need!");
				 System.out.println("If you want to go to < FLIGHTS > page, enter F");
				 System.out.println("If you want to go to < MAKE RESERVATIONS > page, enter R");
				 System.out.println("If you want to go to < MY RESERVATION > page, enter MR");
				 System.out.println("If you want to go to < INFORMATION > page, enter I");
				 System.out.println("If you want to go to < CLIENTS > page, enter C");

				 System.out.println("Please, enter the path for your choise!");
					
				 String choise = sc.next();
						  
				 if(choise.equals("F") || choise.equals("f")) {
					 runDemoFlight(); 
				 } else if(choise.equals("R") || choise.equals("r") ) {
					 runDemoReservation();
				 } else if(choise.equals("MR") || choise.equals("mr")) {
					 runDemoMyReservation();		
				 } else if(choise.equals("I") || choise.equals("i")) {
					 runDemoInformation();
				 } else if(choise.equals("C") || choise.equals("c")) {
					 runDemoClient();
				 } else while (!choise.equals("F") && !choise.equals("f") && !choise.equals("R") && !choise.equals("r") && !choise.equals("MR") && !choise.equals("mr") && !choise.equals("I") && !choise.equals("i") && !choise.equals("C") && !choise.equals("c")) {
					 System.out.println("THE PATH YOU ENTERED IS INCORRECT!");
						
					 System.out.println("Please, TRY AGAIN");
					 System.out.println();
					 choise = sc.next();
			 }
			 
		}		

	}
	
}

