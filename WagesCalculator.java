import java.util.Scanner;
public class WagesCalculator{
	public static void main (String[]args){
		//Declare constants
		final double BASE_HOURS = 44;
		final double OT_MULTIPLIER = 1.5;
		int SENTINEL = -1;

		//Declare variables
		double hoursWorked, hourlyRate; 
		double salary = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter hours worked (or -1 to end): ");
		hoursWorked = in.nextDouble();

		//Read the first set to "seed" the while loop 
		while (hoursWorked != SENTINEL){
		  System.out.print("Enter hourly rate of the worker: ");
		  hourlyRate = in.nextDouble();

		  if(hoursWorked <= 44){
			  salary = hourlyRate * hoursWorked;
		  }
		  else if(hoursWorked > 44){
			  salary = hourlyRate * BASE_HOURS + ((hoursWorked - 44) * hourlyRate * OT_MULTIPLIER);
		  }
		  //Print results
		  System.out.printf("Salary is: $%.2f%n%n",salary);
		 
		  //Read the next set
		  System.out.print("Enter hours worked (or -1 to end): ");
		  hoursWorked = in.nextDouble();
        }

        if(hoursWorked == SENTINEL){
          System.out.println("bye");
        }
    in.close();

	}
}