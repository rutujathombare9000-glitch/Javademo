package com.itvedant.firstProject;

import java.util.Scanner;

public class FlightFunction {

	static String source;
	static String destination;
	static String airlinename;
	static byte noofPassengers;
	static double ticketPrice = 3499.50;
	static double bookingPrice , finalTicketPrice;
	static boolean bookingStatus=false;
    static String passengerCategoryString;
    static double discount = 0.0;
    
  //method to accept booking details
    static void setBookingDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the airline name, Source, Destination");
        airlinename = sc.next();
        source = sc.next();
        destination = sc.next();
        System.out.println("The ticket price is Rs. " + ticketPrice);
        System.out.println("Please enter no of passengers");
        noofPassengers = sc.nextByte();
        System.out.println("Please enter the passenger category as 'regular' or 'student' or 'armed forces'?");
        
        sc.nextLine();
        passengerCategoryString = sc.nextLine();
        bookingPrice = noofPassengers * ticketPrice;
        bookingStatus = true;
        System.out.println("Thank you for providing details.");
        sc.close();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
setBookingDetails();
	}

}
