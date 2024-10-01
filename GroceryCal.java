//Comilang, Tayshaun M.
//CITCS 1N-A
//September 13, 2024

package grocerycal;
import java.util.Scanner;
public class GroceryShoppingCalculator{

	public static void main(String[] args) {
            
	Scanner scanner = new Scanner(System.in);
        double price1, price2, price3, subtotal, discountRate, salesTaxRate, discount, subtotalAfterDiscount, salesTax, finalTotal;	
        int quantity1, quantity2, quantity3;
	
        //Price and Quantity of item 1
	System.out.print("Enter the price of item 1: ");
        price1 = scanner.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        quantity1 = scanner.nextInt();
	
        //Price and Quantity of item 2
        System.out.print("Enter the price of item 2: ");
        price2 = scanner.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        quantity2 = scanner.nextInt();

        //Price and Quantity of item 3
        System.out.print("Enter the price of item 3: ");
        price3 = scanner.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        quantity3 = scanner.nextInt();
        
        //Add the cost of all items
        subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);

        //Add the 5% Discount
        discountRate = 0.05;  
        
        //Add the 12% Discount
        salesTaxRate = 0.12;  
        
        //Calculate the disocunt, subtotal, and salestax
        discount = subtotal * discountRate;
        subtotalAfterDiscount = subtotal - discount;
        salesTax = subtotalAfterDiscount * salesTaxRate;
        
        //Calculate the finaltotal
        finalTotal = subtotalAfterDiscount + salesTax;
        
        //Diplay the results
        System.out.printf("Subtotal       : PHP %.2f\n", subtotal);
        System.out.printf("Discount       : PHP %.2f\n", discount);
        System.out.printf("Sales Tax      : PHP %.2f\n", salesTax);
        System.out.printf("Final Total    : PHP %.2f\n", finalTotal);

        //Close the scanner
        scanner.close();
        
	}
}
