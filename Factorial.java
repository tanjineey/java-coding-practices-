import java.util.Scanner;
//Program that prompts user for integer n and prints the factorial of n

public class Factorial{
	public static void main(String[]args){
		//Declare Variables
		int i, n;
		int product = 1;

		Scanner in = new Scanner(System.in);
        //Prompt and read input as "int"
        System.out.print("Enter an integer: ");
        n = in.nextInt();

        if(n <= 12){
          for(i = 1; i <= n ; i++){
       	  product = product * i;
        }
        }
       //Display results
       System.out.println("The Factorial of " + n + " is: " + product);
       in.close();

	}
}