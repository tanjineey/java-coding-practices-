import java.util.Scanner;
//Program to test Boolean method
public class OddEven{
	public static void main(String[]args){
		int number;
		Scanner in = new Scanner(System.in);
		// Prompt and read the number as "int"
		System.out.print("Enter a number: ");
		number = in.nextInt();

		if(isOdd(number)){
			System.out.println(number + " is an odd number");
		}
		if(!isOdd(number)){
			System.out.println(number + " is an even number");
		}
		in.close();
	}
	public static boolean isOdd(int number){
		if (number % 2 == 0){
			return false;
		} else{
			return true;
		}
	}
}