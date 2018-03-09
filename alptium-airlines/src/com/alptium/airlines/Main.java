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

	}
	
	private static void runDemoReservation() {

		System.out.println("Welcome to the page RESERVATIONS");

	}
	
	private static void runDemoMyReservation() {

		System.out.println("Welcome to the page MY RESERVATIONS");

	}
	
	private static void runDemoInformation() {

		System.out.println("Welcome to the page INFORMATION");

	}
	
	private static void runDemoClient() {

		System.out.println("Welcome to the page CLIENTS");

	}
	
}

