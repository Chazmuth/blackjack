package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[][] cardsValueArray = {
                {"Ace", "1"}, {"1", "1"},
                {"2", "2"}, {"3", "3"},
                {"4", "4"}, {"5", "5"},
                {"6", "6"}, {"7", "7"},
                {"8", "8"}, {"9", "9"},
                {"10", "10"}, {"Jack", "10"},
                {"Queen", "10"}, {"King", "10"}};

        String[] suitArray = {"Clubs", "Spades", "Hearts", "Diamonds"};

        Random random = new Random();

        while (true) {
            System.out.println("Its Blackjack Time!");

            //User First and second draws and ouptuts

            //First card name and suit values
            int userDrawOneInt = random.nextInt(13);
            int userDrawOneSuitInt = random.nextInt(3);

            //Second card name and suit values
            int userDrawTwoInt = random.nextInt(13);
            int userDrawTwoSuitInt = random.nextInt(3);

            //First card name and suit strings
            String userDrawOneName = cardsValueArray[userDrawOneInt][0];
            String userDrawOneSuit = suitArray[userDrawOneSuitInt];

            //Second card name and suit strings
            String userDrawTwoName = cardsValueArray[userDrawTwoInt][0];
            String userDrawTwoSuit = suitArray[userDrawTwoSuitInt];

            //Tells the user their draw
            System.out.println(
                    "You have drawn a " + userDrawOneName + " of " + userDrawOneSuit +
                            " and a " + userDrawTwoName + " of " + userDrawTwoSuit
            );

            //stores the value of the users cards
            int userDrawValue = Integer.parseInt(cardsValueArray[userDrawOneInt][1]) +
                    Integer.parseInt(cardsValueArray[userDrawTwoInt][1]);

            //computer draws but they are kept secret from the user

            //First card name and suit values
            int compDrawOneInt = random.nextInt(13);
            int compDrawOneSuitInt = random.nextInt(3);

            //Second card name and suit values
            int compDrawTwoInt = random.nextInt(13);
            int compDrawTwoSuitInt = random.nextInt(3);

            //First card name and suit strings
            String compDrawOneName = cardsValueArray[compDrawOneInt][0];
            String compDrawOneSuit = suitArray[compDrawOneSuitInt];

            //Second card name and suit strings
            String compDrawTwoName = cardsValueArray[compDrawTwoInt][0];
            String compDrawTwoSuit = suitArray[compDrawTwoSuitInt];

            //stores the value of the comps cards
            int compDrawValue = Integer.parseInt(cardsValueArray[compDrawOneInt][1]) +
                    Integer.parseInt(cardsValueArray[compDrawTwoInt][1]);

            while (compDrawValue<21 && userDrawValue<21) {
                //ask the user if they want to draw another card
                //adds the value of that card to userDrawValue
                //computer decides if it wants to draw another card
                //adds value of that card to compDrawValue
                //checks if either value is equal to 21 and makes a win bool true for either
            }
        }

    }
}
