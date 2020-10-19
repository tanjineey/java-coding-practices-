import java.util.Scanner;
//Program that calculates taxable income 
public class IncomeTaxCalculator{
	public static void main(String[]args){
	  // Declare constants first (variables may use these constants)
      // The keyword "final" marked these as constant (i.e., cannot be changed).
      // Use uppercase words joined with underscore to name constants
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
	  //Declare variables
		int taxableIncome;
		double taxPayable;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the taxable income: $");
		taxableIncome = in.nextInt();
	  //Compute tax payable in "double" using a nested-if to handle 4 cases
		if (taxableIncome <= 20000){
			taxPayable = 20000 * 0 ;
		} else if (taxableIncome <= 40000){
			taxPayable = (TAX_RATE_ABOVE_20K * (taxableIncome - 20000)); 
		} else if (taxableIncome <= 60000){
			taxPayable = (TAX_RATE_ABOVE_20K * 20000) + (TAX_RATE_ABOVE_40K * (taxableIncome - 40000));
		} else {
			taxPayable = (TAX_RATE_ABOVE_20K * 20000) + (TAX_RATE_ABOVE_40K * 20000) + (TAX_RATE_ABOVE_60K *(taxableIncome - 60000));
		}
      // Display results
		System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
		in.close();

	}
}