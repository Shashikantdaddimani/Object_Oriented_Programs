package com.java.stockaccountmanagement;

import java.util.Scanner;

public class StockPortfolio extends StockAccountManagement {

	/*
	 * Program execution starts from main method
	 */
	public static void main(String[] args) {
		/*
		 * Taking User input using Scanner object
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total number of Stocks");
		setNumOfStocks(input.nextInt());
		for (int i = 1; i <= getNumOfStocks(); i++) {
			StockPortfolio stockAccount = new StockPortfolio();
			stockAccount.addShare();
			totalValue += stockPrice;
		}
		System.out.println("\nTotal Value is " + totalValue);
	}

}
