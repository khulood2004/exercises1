package com.example.carts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String value : values) {
                deck.add(value + " of " + suit);
            }
        }

        Collections.shuffle(deck);
        int numPlayers = 4;
        List<List<String>> hands = dealCards(deck, numPlayers);

        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Player " + (i + 1) + ": " + hands.get(i));
        }
    }

    public static List<List<String>> dealCards(List<String> deck, int numPlayers) {
        List<List<String>> hands = new ArrayList<>();
        int cardsPerPlayer = deck.size() / numPlayers;

        for (int i = 0; i < numPlayers; i++) {
            hands.add(new ArrayList<>(deck.subList(i * cardsPerPlayer, (i + 1) * cardsPerPlayer)));
        }

        return hands;
    }
}