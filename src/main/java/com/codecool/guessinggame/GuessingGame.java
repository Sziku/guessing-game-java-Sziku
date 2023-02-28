package com.codecool.guessinggame;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        int[] listOfRandomNumbers = getListOfRandomNumbers(99,1,10);

        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < listOfRandomNumbers.length; i++) {

            int playerGuess = 0;
            println("Guess a number between 1 and 99");

            while (listOfRandomNumbers[i] != playerGuess) {
                println("Enter your guess:");

                playerGuess = reader.nextInt();

                guessGameResult(listOfRandomNumbers, i, playerGuess);
            }
        }
    }

    private static int[] getListOfRandomNumbers(int max, int min, int matchNumbers) {
        int range = max-min + 1;

        int[] listOfRandomNumbers = new int[matchNumbers];
        for (int i=0; i< listOfRandomNumbers.length;i++) {
            listOfRandomNumbers[i]=(int)(Math.random() * range) + 1;
        }
        return listOfRandomNumbers;
    }

    private static void guessGameResult(int[] listOfRandomNumbers, int i, int playerGuess) {
        if (playerGuess < listOfRandomNumbers[i]) {
            println("guess is low");
        } else if (playerGuess > listOfRandomNumbers[i]) {
            println("guess is too high");
        } else   {
            println("you guessed it!");
        }
    }

    private static void println(String line) {
        System.out.println(line);
    }
}

