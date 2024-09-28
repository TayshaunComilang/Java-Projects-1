/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery;
import java.util.Scanner;
public class Grocery {

    public static void main(String[] args) {
        
        //Use Scanner class to input the total purchase amount
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total purchace amount (PHP): ");
        double totalAmount = scanner.nextDouble();
        
        //Initialized dicount variables
        double discount = 0;
        double finalPrice;
        
        //Determine discount based on the total purchased amount
        if (totalAmount < 1000) {
            discount = 0;
        } else if (totalAmount >= 1000 && totalAmount <= 5000) {
            discount = 0.05; // 5%
        } else if (totalAmount > 5000 && totalAmount <= 10000) {
            discount = 0.10; // 10%
        } else {
            discount = 0.15; // 15%
        }

        // Calculate the final price
        finalPrice = totalAmount - (totalAmount * discount);

        // Display the results
        System.out.printf("Discount applied: %.0f%%\n", discount * 100);
        System.out.printf("Final price after discount: PHP %.2f\n", finalPrice);

        // Close the scanner
        scanner.close();     
         
        }
    }

