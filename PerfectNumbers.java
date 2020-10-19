import java.util.Scanner;
public class PerfectNumbers{
	public static void main(String[]args){
		int upperbound;
		Scanner in = new Scanner(System.in);
		//Prompt user for an upperbound to be read as int
		System.out.print("Enter the upperbound: ");
		upperbound = in.nextInt();
		System.out.println("Perfect numbers between 1 and " + upperbound + " are:");

		for(int i = 1; i < upperbound; i++){
			isPerfect(i); //Check if number is perfect
			if(isPerfect(i)){
				printFactor(i); //print numbers that are perfect with their factors
			}
		}



		in.close();

	}
	public static boolean isPerfect(int number){
		int sum = 0;
		int divisor = 0;
		for(int i = 1; i < number; ++i){
			if (number % i == 0){
				divisor = i;
				sum += divisor;
			}
		}
		if(sum == number){
			return true;
		} else {
			return false;
		}

	}
	public static void printFactor(int number){
		System.out.print(number + " = ");
		for(int i = 1; i < number; ++i){
			if (number % i == 0){
				System.out.print(i);
				if(i < number/2){
				 	System.out.print(" + ");
				} 
			}
		}
		System.out.println("");

	}
}