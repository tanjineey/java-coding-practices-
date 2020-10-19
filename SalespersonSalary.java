import java.util.Scanner;
//Program that calculates the salary of ALL the salesperson in the company
public class SalespersonSalary{
	public static void main(String[]args){
		//Declare constants
		final double BASE_SALARY = 1000;
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;

		//Declare variables
		int sales;
		double salary;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter sales in dollars (or -1 to end): ");
		sales = in.nextInt();

		while (sales != SENTINEL){
			salary = 1000 + (COMMISSION_RATE * sales);
			System.out.printf("Salary is: $%.2f%n%n", salary);
			System.out.print("Enter sales in dollars (or -1 to end): ");
		    sales = in.nextInt();
		}

		if(sales == SENTINEL){
			System.out.println("bye");
		}

		in.close();
	}
}
