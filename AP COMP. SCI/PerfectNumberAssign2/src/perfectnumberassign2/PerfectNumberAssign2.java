/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perfectnumberassign2;

import java.util.Scanner; 

public class PerfectNumberAssign2 {

    // 1st Main method to run the program
    public static void main(String[] args) {
        // Create an instance of PerfectNumber
        PerfectNumberAssign2 classifier = new PerfectNumberAssign2();

        // Asking the user for a positive integer using Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt(); // Read input from terminal

        // Get the sum of proper divisors
        int sumOfDivisors = classifier.divisorSum(number);

        ///Determine and print whether the number is perfect, deficient, or abundant
        // This will determine and print whether the number is perfect, deficient, or abundant. 
        //If the sum of the divisors is less than the number, it is deficient. If the sum exceeds the number, it is abundant.
        String result;
        if (sumOfDivisors == number) {
            result = number + " is a perfect number.";
        } else if (sumOfDivisors < number) {
            result = number + " is a deficient number.";
        } else {
            result = number + " is an abundant number.";
        }

        // Print the result to the terminal
        System.out.println(result);
    }

    // 2nd Method to check if a divisor is a correct divisor of the number
    public boolean isDivisor(int num, int divisor) {
        return (num % divisor == 0);
    }

    // 3rd Method to sum all proper divisors of the given number
    public int divisorSum(int number) {
        int sum = 0;
        // Iterate from 1 to number - 1 to find right divisors
        for (int i = 1; i < number; i++) {
            if (isDivisor(number, i)) {
                sum += i;
            }
        }
        return sum;
    }
}

