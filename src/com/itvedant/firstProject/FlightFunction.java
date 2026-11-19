
package com.itvedant.firstProject;

import java.util.Scanner;

public class FlightFunction {

    static String source;
    static String destination;
    static String airlinename;
    static byte noofPassengers;
    static double ticketPrice = 3499.50;
    static double bookingPrice, finalTicketPrice;
    static boolean bookingStatus = false;
    static String passengerCategoryString;
    static double discount = 0.0;

    // Method to accept booking details
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
        if(noofPassengers > 0 && noofPassengers <= 5) // number of passengers must be 1 to 5
        {
            bookingPrice = noofPassengers * ticketPrice;

            switch(passengerCategoryString)
            //Note that category must be entered exactly as 'regular' or 'student' or 'armed forces'
            //As java is case sensitive
            {
                case "regular":
                    discount = 5.0;
                    break;

                case "student":
                    discount = 10.0;
                    break;

                case "armed forces":
                    discount = 20.0;
                    break;

                default: //this will be executed if category is other than 'regular' or 'student' or 'armed forces'
                    System.err.println("please provide valid category");
            }

            bookingStatus = true;
        }
        else {
            System.err.println("Your booking cannot be processed, as number of passengers must be 1 to 5");
            bookingPrice = 0;
        }

        sc.close();
        }
 // accept discount percent and return total price after discount

    static double calculateFinalTicketPrice(double percent) {

        // discount = percent;

        double amountToPay = bookingPrice - bookingPrice * discount / 100;

        return amountToPay;
    }

    // Method to display booking information
    static void displayBookingInformation() {

        System.out.println("----- Flight Booking Details -----");

        System.out.println("Airline Name: " + airlinename);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Number of Passengers: " + noofPassengers);
        System.out.println("Passenger Category: " + passengerCategoryString);
        System.out.println("Ticket Price: Rs. " + ticketPrice);
        System.out.println("Booking Price: Rs. " + bookingPrice);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Ticket Price: Rs. " + finalTicketPrice);
    }

    public static void main(String[] args) {

        setBookingDetails();

        if (bookingStatus) {

            finalTicketPrice = calculateFinalTicketPrice(5.0);

            System.out.println("You need to pay rupees Rs. " + finalTicketPrice);

            System.out.println("Your booking is confirmed!!");
          
            displayBookingInformation();
        }
    }
}
