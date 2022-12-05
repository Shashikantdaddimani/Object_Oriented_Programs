package com.java.manageaccount;

/**
 * imports the Scanner class of the java.util package
 */
import java.util.Scanner;

/**
 * Class to create ManageAcoount with different methods
 */
public class ManageAcoount {
	/*
	 * Veriable declare
	 */
	private static double currentbalance = 5000.00;
	/*
	 * Taking user input using Scanner object
	 */
	Scanner input = new Scanner(System.in);

	/*
	 * Taking the Getter And setter Method To Prtect our data and Return and update
	 * the values
	 */
	public static double getCurrentbalance() {
		return currentbalance;
	}

	public static void setCurrentbalance(double currentbalance) {
		ManageAcoount.currentbalance = currentbalance;
	}

	/*
	 * Method Name:Show Balance 
	 * Description:Used Show Balance method to Display the
	 * current balance
	 */
	public void showBalance() {
		System.out.println("Current Balance :" + currentbalance);
	}

	/*
	 * Method Name:addBalance
	 *  Logic for Amount should be added to the current balance
	 */
	public void addBalance() {
		System.out.println("\nEnter the amount to added");
		double addAmount = input.nextDouble();
		currentbalance = currentbalance + addAmount;
		System.out.println("Amount added SucessFully");
		System.out.println("\nPress 1 to view the account balance");
		int account = input.nextInt();
		if (account == 1)
			System.out.println("Your account Balance is :" + currentbalance);
	}

	/*
	 * Method name:WithdrawBalance 
	 * Logic for Withdraw the current Balance amount
	 */
	public void withDrawBalance() {
		System.out.println("Enter the withdrawal Amount");
		double withDrawamount = input.nextDouble();
		if (withDrawamount <= 0) {
			System.out.println("please Enter the Valied Amount");
		} else if (withDrawamount > currentbalance) {
			System.out.println("Insufficient Balance");
		} else {
			System.out.println("Please wait");
			System.out.println("...........");
			System.out.println("Balance withdrawal sucessfully");
			currentbalance = currentbalance - withDrawamount;
			System.out.println("\nAvailable Balance is :" + currentbalance);
		}

	}

}
