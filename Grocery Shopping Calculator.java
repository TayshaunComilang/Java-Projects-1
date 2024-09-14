//Comilang, Tayshaun M.
//CITCS 1N-A
//September 13, 2024

package Invoice;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
	System.out.print("Enter the price of item 1: ");
        double price1 = scanner.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = scanner.nextInt();
		
        System.out.print("Enter the price of item 2: ");
        double price2 = scanner.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = scanner.nextInt();

        System.out.print("Enter the price of item 3: ");
        double price3 = scanner.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = scanner.nextInt();
        
        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);

        double discountRate = 0.05;  
        double salesTaxRate = 0.12;  
        
        double discount = subtotal * discountRate;
        double subtotalAfterDiscount = subtotal - discount;
        double salesTax = subtotalAfterDiscount * salesTaxRate;
        
        double finalTotal = subtotalAfterDiscount + salesTax;
        
        System.out.printf("Subtotal       : PHP %.2f\n", subtotal);
        System.out.printf("Discount       : PHP %.2f\n", discount);
        System.out.printf("Sales Tax      : PHP %.2f\n", salesTax);
        System.out.printf("Final Total    : PHP %.2f\n", finalTotal);

        scanner.close();
    }

}
