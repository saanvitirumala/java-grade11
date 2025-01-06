/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangleanalyzer;

/**
 *
 * @author 26tirusaan
 */
import java.util.Scanner;
public class TriangleAnalyzer {




    // Inner class Triangle
    class Triangle {
        // These are to store the lengths of the sides
        private double side1;
        private double side2;
        private double side3;

        // To initialize the sides the sides of a triangle
        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1; // "this." is to specify the current object/constructor being called for action
            this.side2 = side2;
            this.side3 = side3;
        }

        // Method to check if the sides form a valid triangle
        public boolean isValid() {
            return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
        }

        // Method to determine the type of triangle
        public String getType() {
            if (!isValid()) {
                return "Not a valid triangle";
            }
            if (side1 == side2 && side2 == side3) {
                return "Equilateral";
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        }
    }

    public static void main(String[] args) { // User interface to take in inputs of triangle from the user
        Scanner scanner = new Scanner(System.in);

        // Get side lengths from the user
        System.out.print("Enter the length of the 1st side: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the 2nd side: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the 3rd side: ");
        double side3 = scanner.nextDouble();

        // Create a Triangle object
        TriangleAnalyzer analyzer = new TriangleAnalyzer(); // Create an instance of TriangleAnalyzer
        Triangle triangle = analyzer.new Triangle(side1, side2, side3); // Create an instance of Triangle using the analyzer instance

        // Check and display whether it's a valid triangle and its type
        if (triangle.isValid()) { // ".isValid" to see if represented triangle object is still valid with statements
            System.out.println("The sides form a valid triangle.");
            System.out.println("The triangle is " + triangle.getType() + "."); // ".getType" will get the category of the given character. In this case it will return the declared data type
        } else {
            System.out.println("The sides do not form a valid triangle."); 
        }

        scanner.close();
    }
}
    
