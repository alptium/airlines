package com.alptium.airlines;

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

		System.out.println("Welcome to the page RESERVATIONS");
		System.out.println("Follow the instructions, find and reserve your flight");
		
		try(Scanner sc = new Scanner(System.in)) {
			
			 	String departurePlace;
			 	String arrivalPlace;
			 	String dateOfDeparture;
			 	String dateOfReturn = "";
			 	int typeOfTrip;
			 	int numOfPassangers;
			 				
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
				
				Reservation reservation = new Reservation(departurePlace, arrivalPlace, dateOfDeparture, dateOfReturn, typeOfTrip, numOfPassangers);	

				System.out.println("You have successfully booked your flight. Your booking details are:");
				System.out.println("Flight from:" + reservation.getDeparturePlace());
				System.out.println("Flight to:" + reservation.getArrivalPlace());
				System.out.println("Date of departure:" + reservation.getDateOfDeparture());
				System.out.println("Date of return:" + reservation.getDateOfReturn());
				System.out.println("Number of passangers:" + reservation.getNumOfPassangers());
			}
		
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
	
	private static void runDemoMyReservation() {

		System.out.println("Welcome to the page MY RESERVATIONS");
		
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

