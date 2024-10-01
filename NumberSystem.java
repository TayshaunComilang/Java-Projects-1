//Comilang, Tayshaun
//CITCS 1N-A

package com.mycompany.numbersystem;
import java.util.Scanner;
public class NumberSystem {
    
    // Method to convert a number from a given base to an integer
    private static int convertToDecimal(String number, int base) {
        return Integer.parseInt(number, base);
    }

    // Method to convert an integer to a string representation in a given base
    private static String convertFromDecimal(int decimalNumber, int base) {
        return Integer.toString(decimalNumber, base).toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the base (2-16) of the number system (or type 'STOP' to exit): ");
            String baseInput = scanner.nextLine();
            if (baseInput.equalsIgnoreCase("STOP")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            
            int base;
            try {
                base = Integer.parseInt(baseInput);
                if (base < 2 || base > 16) {
                    System.out.println("Invalid base! Please enter a base between 2 and 16.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer for the base.");
                continue;
            }
            
            System.out.print("Enter the number in base " + base + ": ");
            String numberInput = scanner.nextLine();
            
            try {
                // Convert the input number to decimal
                int decimalNumber = convertToDecimal(numberInput, base);
                
                // Print conversions from decimal to all bases (2 to 16)
                System.out.println("Conversions of " + numberInput + " from base " + base + " to all bases (2-16):");
                for (int targetBase = 2; targetBase <= 16; targetBase++) {
                    String convertedNumber = convertFromDecimal(decimalNumber, targetBase);
                    System.out.println("Base " + targetBase + ": " + convertedNumber);
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid number for base " + base + "! Please try again.");
            }
        }
        
        scanner.close();
    }
}
