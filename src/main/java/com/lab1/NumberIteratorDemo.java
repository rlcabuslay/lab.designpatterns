package com.lab1;

import java.util.Scanner;

public class NumberIteratorDemo {

	public static void main(String[] args) {
		NumberIterator numberIterator = new NumberIterator();
        try {
            Scanner scanner = new Scanner(System.in);
            String reply = "y";
            while (reply.equalsIgnoreCase("y")) {
                System.out.print("Enter number: ");
                int number = scanner.nextInt();
                numberIterator.convertNumberToWords(number);
                System.out.print("Continue (y/n)? ");
                reply = scanner.next();
                System.out.println("-----------------------------------------");
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
