package com.itvedant.firstProject;

import java.util.Scanner;
public class FlightBookings {
    public static void main(String[] args) {

        String source;
        String destination;
        byte noOfPassengers;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the Flight Booking details: ");
        System.out.println("Enter the source, destination and number of passengers");

        source = sc.next();
        destination = sc.next();
        noOfPassengers = sc.nextByte();

        // declaring string array to store passenger names
        String[] passengerNames = new String[noOfPassengers];

        // declaring byte array to store passenger age
        byte[] passengerAge = new byte[noOfPassengers];

        System.out.println("Enter the " + noOfPassengers + " passenger names");

        // accept the passenger names using for loop
        for (byte i = 0; i < passengerNames.length; i++) {
            passengerNames[i] = sc.next();
            passengerAge[i] = sc.nextByte();
        }

        sc.close();

        // displaying the passenger names and ages
        System.out.println("Following passengers are travelling from " +
                source + " to " + destination);

        for (byte i = 0; i < noOfPassengers; i++) {
            System.out.println("Passenger name: " + passengerNames[i] +
                    ", Age: " + passengerAge[i]);
        }
    }
}