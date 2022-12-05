package com.java.deckofcards;

/**
 * imports the Random class of the java.util package
 */
import java.util.Random;

/**
 * Class to create AccountOperation with different methods
 */
public class DeckOfCards {
	/*
	 * Initiliase the varible for array
	 */
	String suits[] = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String ranks[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	/*
	 * Declare the 2D Array
	 */
	String cards[][] = new String[4][13];
	String player[][] = new String[4][9];

	/*
	 * logic for combinations of both suits and Rank
	 */
	public void getCardCombination() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cards[i][j] = ranks[j] + " of " + suits[i];

			}
		}
	}
	/*
	 * logic for shuffel the cards using random method and distribute 9 cards to 4 players
	 */
	public void getPlayer() {
		for (int i = 0; i < 4; i++) {
			System.out.println("\n ~ Cards for Player " + (i + 1) + " ~\n");
			for (int j = 0; j < 9; j++) {
				Random random = new Random();
				int randomSuit = random.nextInt(4);
				int randomRank = random.nextInt(13);
				player[i][j] = cards[randomSuit][randomRank];
				System.out.print(player[i][j] + "   \n");

			}
		}
	}
}
