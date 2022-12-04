package com.java.stockaccountmanagement;
/**
 * imports  the scanner  class of the java.util package
 */
import java.util.Scanner;
/**
 * Class to create TicTacToe game with different methods
 */

public class StockAccountManagement {
	/*
	 * Declaring the veriable
	 */
	private static int numOfStocks;
	private static String shareName;
	private static int numOfShare;
	private static int sharePrice;
	static int stockPrice;
	static int totalValue;
	/*
	 * Declaring the Getter And Setter Methods
	 */
	public static int getNumOfStocks() {
		return numOfStocks;
	}
	public static void setNumOfStocks(int numOfStocks) {
		StockAccountManagement.numOfStocks = numOfStocks;
	}
	public static String getShareName() {
		return shareName;
	}
	public static void setShareName(String shareName) {
		StockAccountManagement.shareName = shareName;
	}
	public static int getNumOfShare() {
		return numOfShare;
	}
	public static void setNumOfShare(int numOfShare) {
		StockAccountManagement.numOfShare = numOfShare;
	}
	public static int getSharePrice() {
		return sharePrice;
	}
	public static void setSharePrice(int sharePrice) {
		StockAccountManagement.sharePrice = sharePrice;
	}
	public static int getStockPrice() {
		return stockPrice;
	}
	public static void setStockPrice(int stockPrice) {
		StockAccountManagement.stockPrice = stockPrice;
	}
	public static int getTotalValue() {
		return totalValue;
	}
	public static void setTotalValue(int totalValue) {
		StockAccountManagement.totalValue = totalValue;
	}
	
	public void addShare() {

		/*
		 * Taking User input using Scanner object
		 */

		Scanner input = new Scanner(System.in);
		/*
		 *  User adds new Shares and its  details
		 */
		System.out.println("\nEnter the Name of Share");
		shareName = input.nextLine();
		System.out.println("Enter the number of Shares");
		numOfShare = input.nextInt();
		System.out.println("Enter the price for Shares");
		sharePrice = input.nextInt();
		
		stockPrice = numOfShare * sharePrice;
		System.out.println("\nValue of Stock " + shareName + " is = " + stockPrice);
		
	}
	
}
