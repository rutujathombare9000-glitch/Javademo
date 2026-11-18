package com.itvedant.firstProject;

import java.security.PublicKey;
import java.util.Scanner;

public class FlightBooking {

	public static void main(String[] args) {
	
		
		// create scanner object
		 Scanner sc = new Scanner(System.in);

		 // Taking Inputs
		 System.out.println("Enter Passenger Name: ");
		 String name = sc.nextLine();

		 System.out.println("Enter Age: ");
		 int age = sc.nextInt();

		 System.out.println("Enter Number of Tickets: ");
		 int tickets = sc.nextInt();

		 System.out.println("Enter Price per tickets: ");
		 double price = sc.nextDouble();

		 System.out.println("Do you want food? (True/False): ");
		 boolean food = sc.nextBoolean();
		 
		// Arithmetic operator
		 double totalFare = tickets * price;

		 // Assignment Operators (adding service charge)
		 totalFare += 200; // Flat service charge

		 // Ternary Operator (Discount based on age)
		 double discount = (age < 12 || age > 60) ? totalFare * 0.10 : 0;

		 // Applying Discount
		 totalFare -= discount;

		 // Logical Operator (Offer eligibility)
		 boolean offerEligible = (tickets >= 5 && age >= 18);

		 // Conditional expression (Food Cost)
		 double foodCost = food ? tickets * 150 : 0;

		 totalFare += foodCost;

		 // Modulus Operator (Special condition)
		 if (tickets % 2 == 0) {
		     System.out.println("Special offer : Even number of tickets booked!");
		 }
		 
		//Final Output
		 System.out.println("\n ----- Booking Details -----");
		 System.out.println("Passenger name: "+name);
		 System.out.println("Age: "+age);
		 System.out.println("Tickets: "+tickets);
		 System.out.println("Price per Ticket: "+price);
		 System.out.println("Food included: "+food);
		 System.out.println("Discount Applied: "+discount);
		 System.out.println("Offer Eligible: "+ offerEligible);
		 System.out.println("Total Amount to Pay: "+ totalFare);
		 sc.close();
		 
		 
	
	}

}
