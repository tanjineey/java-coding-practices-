import java.util.Scanner;
public class SumOfDigitsInt{
	public static void main(String[]args){
		int inNumber = 0;
		int inDigit;
		int sum = 0;

		Scanner in = new Scanner(System.in);

        //Prompt and read inputs as "int"
		System.out.print("Enter a positive integer: ");
		inNumber = in.nextInt();

        //Extract the "last" digit repeatably using a while-loop with modulus/ divide operations
        while (inNumber > 0){
        	inDigit = inNumber % 10; //extract the "last digit"
        	inNumber /=10;
        	sum += inDigit;
        }

        System.out.println("The sum of all digits is: " +sum);
        in.close();
	}
}