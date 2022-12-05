package com.java.deckofcards;

/**
 * imports the Scanner class of the java.util package
 */
import java.util.Scanner;

/**
 * Class to create Player with main method
 */
public class Player {
	/*
	 * execution Start from main method
	 */
	public static void main(String[] args) {
		System.out.println("\nPress 1 ->> To view cards of 4 Players");
		DeckOfCards cards = new DeckOfCards();
		/*
		 * Taking user input using Scanner object
		 */
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		switch (num) {
		case 1:
			cards.getCardCombination();
			cards.getPlayer();
			break;
		default:
			System.out.println("!!invalid input!!");
			break;
		}

	}

}
