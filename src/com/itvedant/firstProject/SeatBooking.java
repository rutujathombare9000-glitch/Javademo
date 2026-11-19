package com.itvedant.firstProject;
import java.util.Scanner;
public class SeatBooking {

    public static void main(String[] args) {

        String[][] seats = new String[6][2];

        // Print Seat Structure
        System.out.println("Flight seat structure (6 rows, 2 columns):");

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print("[Empty] ");
            }
            System.out.println();
        }

        // Take Number of Passengers
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of passengers: ");
        int n = sc.nextInt();
        sc.nextLine();

        // User Selects Seat (Row & Column)
        for (int k = 1; k <= n; k++) {

            System.out.println("\nPassenger " + k);

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Row (1-6): ");
            int row = sc.nextInt();

            System.out.print("Enter Column (1-2): ");
            int col = sc.nextInt();
            sc.nextLine();

            row = row - 1;
            col = col - 1;

            if (seats[row][col] == null) {

                seats[row][col] = name;

                System.out.println("Seats booked!");

            } else {

                System.out.println("Seat already booked!");
                k--; // retry
            }
        }

        // Display Final Seating
        System.out.println("\nFinal Seat Map:");

        System.out.println("       C1       C2");

        for (int i = 0; i < seats.length; i++) {

            System.out.print("R" + (i + 1) + " ");

            for (int j = 0; j < seats[i].length; j++) {

                if (seats[i][j] == null) {

                    System.out.print("[Empty]");

                } else {

                    System.out.print("[" + seats[i][j] + "]");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
