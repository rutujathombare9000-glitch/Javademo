package com.itvedant.firstProject;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of passengers: ");
        int n = sc.nextInt();

        int i = 1;

        while(i <= n) {
            System.out.println("\nEnter details for Passenger " + i);

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            // printing details
            System.out.println("\nPassenger " + i + " Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

            i++;
        }

        sc.close();
    }
}