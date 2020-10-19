import java.util.Scanner;
//Program that prints Actual Price, Sales tax and calculates total price, total actual price and total sales tax
public class SalesTax{
	public static void main(String[]args){
		//Declare constants
		final double SALES_TAX_RATE = 0.07;
		final int SENTINEL = -1;

		//Declare variables
		double price, actualPrice, salesTax;
		double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
		price = in.nextDouble();

		while (price != SENTINEL){
			//Compute the tax
			salesTax = price * ((SALES_TAX_RATE/107)*100);
			actualPrice = price - salesTax;
			// Accumulate into the totals
			totalPrice += price;
			totalActualPrice += actualPrice;
			totalSalesTax += salesTax; 
			//Print results
			
			System.out.printf("Actual Price is: $%.2f, Sales Tax is: $%.2f%n%n", actualPrice, salesTax);
			System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
		    price = in.nextDouble();
		}
		//print Totals
		if (price == SENTINEL){
			System.out.printf("Total Price is: $%.2f%n", totalPrice);
			System.out.printf("Total Actual Price is: $%.2f%n", totalActualPrice);
			System.out.printf("Total Sales Tax is: $%.2f%n", totalSalesTax);
		}
	}
}