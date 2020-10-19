import java.util.Scanner;
//Program to calculate the amount to be paid
public class ParkingCharges{
	public static void main(String[]args){
		//Declare constants
		final double BASE_HOURS = 3.0;
		final double BASE_CHARGES = 2.0;
		final double HOURLY_CHARGES = 0.5;
		final double MAX_CHARGES = 10.0;
		final int SENTINEL = -1;

		//Declare variables 
		double hours;
		double charges = 0.0;
		double totalCharges = 0.0;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the hours parked (or -1 to end): ");
		hours = in.nextDouble();

		while(hours != SENTINEL){
			if (hours <= 3.0){
				charges = BASE_CHARGES;
			}
			else if (hours > 3.0){
				charges = BASE_CHARGES + (Math.ceil(hours - 3.0) * 0.5);
					if (charges >= 10.0){
						charges = MAX_CHARGES;
			        }        
			}
		    System.out.printf("Parking fee is: $%.2f%n", charges);
		    System.out.print("Enter the hours parked (or -1 to end): ");
		    hours = in.nextDouble();
		    totalCharges += charges;
		}
        if (hours == SENTINEL){
        	System.out.printf("The total parking receipts is: $%.2f%n", totalCharges);
        }
	}
}