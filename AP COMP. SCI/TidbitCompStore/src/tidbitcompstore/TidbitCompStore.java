/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tidbitcompstore;


import java.util.Scanner;
public class TidbitCompStore {

 public static void main(String[] args) {
        // Initialize a scanner to get user input
        Scanner input = new Scanner(System.in);
        // Prompt user for the cost of the computer
        System.out.println("Please enter in a computer amount or else I'll go homeless: ");      
        double computerCost = input.nextDouble();
        // Prompt user for the annual interest rate
        System.out.println("Please enter in annual rate or I WILL go HOMELESS: ");
        double interestRate = input.nextDouble() / 100.0;
          // Prompt user for the down payment percentage
        System.out.println("PLEASE ENTER IN THE DOWN PAYMENT OR I WILL GO HOMELESS PLEASE: ");
        double downPaymentPercentage = input.nextDouble() / 100.0;

         // Calculate down payment
        double downPayment = computerCost * downPaymentPercentage;
        // Calculate initial balance after down payment
        double initialBalance = computerCost - downPayment;
        // Calculate monthly interest
        double interest = (initialBalance * (interestRate / 12.0));
        // Monthly payment is set at 5% of the initial balance
        double payment = initialBalance * 0.05 ;
        // Calculate the principal amount (part of payment that goes toward reducing the loan balance)
        double principal = payment - interest;
         // Calculate the ending balance after first payment
        double balanceEnd = initialBalance - principal;

        display();

        int month = 1; // Start from the first month
        double total_interest = 0; // To keep track of total interest paid
        while (balanceEnd > 0) { // Loop to calculate and display each month's payments until balance is paid off
              // Recalculate interest for the current balance
            interest = (initialBalance * (interestRate / 12.0));
            interest = interest*100;
            interest = (int)(interest+.5);
            interest = interest/100;
            
            principal = payment - interest;
            principal = principal*100;
            principal = (int)(principal+.5);
            principal = principal/100;
            
               // If the remaining balance is less than the principal, adjust final payment
            if (initialBalance - principal < 0) {
                principal = initialBalance;
                payment = principal + interest;
                total_interest += interest;

            }
             // Update the ending balance after the payment
            balanceEnd = initialBalance - principal;
            System.out.format("%5d%30.2f%25.2f%20.2f%25.2f%25.2f%n", month, initialBalance, principal, interest, payment, balanceEnd);
            if (balanceEnd <= 0) {
                break;
            }
            total_interest += interest;
            initialBalance = balanceEnd;
            month++;

        }
        System.out.println("The total interest paid: $" + String.format("%.2f", total_interest));
    }

    public static void display() {
        System.out.printf("-------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.println("                                 ^^^    P A Y E M E N T  $  C A L C U L A T O R    ^^^                         ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Month               Balance Start              Principal              Interest               Payment               Balance End");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

    }
    
}
