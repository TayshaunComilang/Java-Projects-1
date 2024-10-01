/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarycalculator;

import java.util.Scanner;
public class BinaryCalculator {

	public static void main(String[] args) {
            Scanner myObj = new Scanner (System.in);
            System.out.println("Input your binary: ");
            String userInput = myObj.nextLine ();
	
            int[] testInputs = {5, 10, 20, 48, 91};

        for (int input : testInputs) {
            String binaryString = Integer.toBinaryString(input);
            System.out.printf("Input: %d\tOutput: %s\n", input, binaryString);     
	
	}

}
        }

