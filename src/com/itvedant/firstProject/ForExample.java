package com.itvedant.firstProject;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of passengers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            System.out.println("\nPassenger " + i);

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            //printing details
            System.out.println("\nPassenger " + i + " Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
        sc.close();
    }
}
