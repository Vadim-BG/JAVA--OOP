package com.javalesson.collections.collectionsClass;

import java.util.*;

public class CollectionsRunner {

    public static void main(String[] args) {
        List<Card> deckOfCards = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCards.add(new Card(suit, face));
            }
        }

//        System.out.println("Original deck of cards");
//        for (int i = 0; i < deckOfCards.size(); i++) {
//            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : "  ");
//        }
        Collections.shuffle(deckOfCards);
        Collections.sort(deckOfCards);

        Card card = new Card(Card.Suit.SPADES, Card.Face.Queen);
        int i = Collections.binarySearch(deckOfCards, card);
        if (i >= 0) {
            System.out.println("Card was found at position " + i);
        } else {
            System.out.println("Card was not found");
        }

        List<Card> cardsList = new ArrayList<>(deckOfCards);
        Collections.fill(cardsList, card);
        Collections.addAll(cardsList, card, card, card);
        Collections.copy(cardsList, deckOfCards);
        int frequency = Collections.frequency(cardsList, card);
        System.out.println("Frequency of "+card+" is "+frequency);

        System.out.println("MIN :"+Collections.min(cardsList));
        System.out.println("MAX :"+Collections.max(cardsList));

//        printOutput(cardsList);

//        System.out.println("\n\nCards after shuffle");
//        printOutput((List<Card>) deckOfCards);

        Collections.sort(deckOfCards, new CardComparator());
//        System.out.println("\n\nCards after sorting");
//        printOutput(deckOfCards);
    }

    private static void printOutput(List<Card> deckOfCards) {
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : "  ");
        }
    }

}

