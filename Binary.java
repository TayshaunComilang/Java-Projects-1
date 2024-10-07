//Comilang, Tayshaun M.
//CITCS 1N-A

package com.mycompany.binarycalculator;
import java.util.Scanner;
public class BinaryCalculator {

    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Decimal to Binary Converter");
        System.out.println("Type 'STOP' to end the program.");

        while (true) {
            System.out.print("Enter a decimal number: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("STOP")) {
                System.out.println("Program terminated.");
                break;
            }

            try {
                int decimalNumber = Integer.parseInt(userInput);
                String binaryNumber = decimalToBinary(decimalNumber);
                System.out.println("The binary representation of " + decimalNumber + " is " + binaryNumber);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid decimal number.");
            }
        }

        scanner.close();
    }
}

