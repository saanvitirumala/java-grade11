/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package craps;

/**
 *
 * @author saanv
 */

import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        int chips = 100;
        Random random = new Random(4); // Seed for reproducibility
        Scanner scanner = new Scanner(System.in);

        while (chips > 0) {
            System.out.println("You have " + chips + " chips. How many do you want to bet?");
            int bet = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (bet > chips) {
                System.out.println("You don't have enough chips for that bet.");
                continue;
            }

            System.out.println("Type 'r' to roll the dice.");
            String input = scanner.nextLine();
            if (!input.equalsIgnoreCase("r")) {
                System.out.println("Invalid input. Please type 'r' to roll the dice.");
                continue;
            }

            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int firstRoll = die1 + die2;
            System.out.println("You rolled a " + firstRoll);

            if (firstRoll ==7  || firstRoll == 11) {
                chips += bet;
                System.out.println("YOU WON!!!! You got " + bet + " chips.");
                System.out.println("$$$$$$$$$$$$$$$$ WINNER $$$$$$$$$$$$$$$$$$$");
                continue;
            } else if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12) {
                chips -= bet;
                System.out.println("You crapped out and lost " + bet + " chips.");
                System.out.println("================LOSER======================");
                continue;
            }

            // Point phase
            int point = firstRoll;
            System.out.println("Point is " + point + ". Keep rolling!");
            boolean gameOver = false;

            while (!gameOver) {
                System.out.println("Type 'r' to roll the dice.");
                input = scanner.nextLine();
                if (!input.equalsIgnoreCase("r")) {
                    System.out.println("Invalid input. Please type 'r' to roll the dice.");
                    continue;
                }

                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                int roll = die1 + die2;
                System.out.println("You rolled a " + roll);

                if (roll == point) {
                    chips += bet;
                    System.out.println("YOU WON!!!! You got " + bet + " chips.");
                    System.out.println("$$$$$$$$$$$$$$$$ WINNER $$$$$$$$$$$$$$$$$$$");
                    gameOver = true;
                } else if (roll == 7) {
                    chips -= bet;
                    System.out.println("You crapped out and lost " + bet + " chips.");
                    System.out.println("================LOSER======================");
                    gameOver = true;
                }
            }
        }

        System.out.println("Game over! You have run out of chips.");
        scanner.close();
    }
}
