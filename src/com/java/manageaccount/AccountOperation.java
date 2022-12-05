package com.java.manageaccount;

/**
 * imports the Scanner class of the java.util package
 */
import java.util.Scanner;

/**
 * Class to create AccountOperation with different methods
 */
public class AccountOperation {
	/*
	 * execution Start from main method
	 */
	public static void main(String[] args) {
		while (true) {
			/*
			 * Taking user input using Scanner object
			 */
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter What operation to be performed:");
			System.out.println("Press 1: To view Current Balance");
			System.out.println("Press 2: Deposite Money");
			System.out.println("Press 3:WithDraw Money");
			/*
			 * creating the Object of manageAccount Class to calling the methods to execute
			 */
			ManageAcoount Object = new ManageAcoount();
			int Operation = input.nextInt();
			/*
			 * Using switch cases to checking the operations 
			 */
			switch (Operation) {
			case 1:
				Object.showBalance();
				break;
			case 2:
				Object.addBalance();
				break;
			case 3:
				Object.withDrawBalance();
				break;
			default:
				System.out.println("Invalied choice");

			}

		}

	}

}
